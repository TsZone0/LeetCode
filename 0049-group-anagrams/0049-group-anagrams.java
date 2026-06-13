class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs== null || strs.length==0){
            return new ArrayList<>();
        }

        Map<String,List<String>> freq = new HashMap<>();

        for(String str:strs){
            String freqofstr = getfreq(str);

            if(freq.containsKey(freqofstr)){
                freq.get(freqofstr).add(str);
            }else{
                List<String> strlist= new ArrayList<>();
                strlist.add(str);
                freq.put(freqofstr,strlist);
            }
        }
        return new ArrayList<>(freq.values());
    }

    private String getfreq(String str){

        int freq[] = new int[26];

        for(char c: str.toCharArray()){
            freq[c -'a']++;
        }

        StringBuilder sb = new StringBuilder("");
        char c = 'a';

        for(int i: freq){
            sb.append(c);
            sb.append(i);
            c++;
        }

        return sb.toString();

    }
}