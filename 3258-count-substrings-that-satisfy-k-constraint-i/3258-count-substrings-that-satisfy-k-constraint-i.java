class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int left =0;
        int zero = 0;
        int ans=0;
        int one = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }

            while(zero>k && one>k){
            if(s.charAt(left)=='0'){
                zero--;
            }else{
                one--;
            }
            left++;
            }
            ans += (i - left + 1);
        
        
        }
        return ans;
        
    }
}