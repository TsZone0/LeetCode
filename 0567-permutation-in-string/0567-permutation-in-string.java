class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length() < s1.length()){
                return false;
        } 

        int x = s1.length(), y = s2.length();
        
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];


        for (int i = 0; i < x; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        if (isMap(arr1, arr2)) return true;

  
        for (int j = 1; j <= y - x; j++) {
            arr2[s2.charAt(j - 1) - 'a']--;      
            arr2[s2.charAt(j + x - 1) - 'a']++;    

            if (isMap(arr1, arr2)) return true;
        }

        return false;
    }

    private boolean isMap(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}