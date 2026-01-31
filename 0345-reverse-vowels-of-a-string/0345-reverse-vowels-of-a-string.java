// class Solution {
//     public String reverseVowels(String s) {

//         char[] arr = s.toCharArray();
//         int left = 0, right = arr.length - 1;

//         while(left < right){

//             while(left < right && !isVowel(arr[left]))
//                 left++;

//             while(left < right && !isVowel(arr[right]))
//                 right--;

//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

//         return new String(arr);
//     }

//     private boolean isVowel(char c){
//         return "aeiouAEIOU".indexOf(c) != -1;
//     }
// }







class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder();   
        StringBuilder sb2 = new StringBuilder();  


        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
            || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                sb.append(c);
            }
        }

        
        sb.reverse();

        int j = 0;   


        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
            || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                
                sb2.append(sb.charAt(j));
                j++;   

            } else {
                sb2.append(c);   
            }
        }

        return sb2.toString();
    }
}
