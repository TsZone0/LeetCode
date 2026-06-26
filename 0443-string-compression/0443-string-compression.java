class Solution {
    public int compress(char[] chars) {
       int write =0;
       int i = 0;

       while(i<chars.length){
        char currentchar = chars[i];
        int count = 0;

            while(i<chars.length && chars[i]==currentchar){
                count++;
                i++;
            }

            chars[write++]= currentchar;

            if(count>1){
                for(char c: Integer.toString(count).toCharArray()){
                    chars[write++] = c;
                }
            }
       }
       return write;
    }
}