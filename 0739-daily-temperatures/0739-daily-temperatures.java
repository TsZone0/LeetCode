class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        // int j = 0;
        // s.push(temperatures[0]);
        int [] result = new int[temperatures.length];
        // for(int i=1; i<temperatures.length; i++){

        //      while(j!=temperatures.length && s.peek()>temperatures[i]){
        //          s.push(temperatures[j]);
        //          j++;
        //         }
        //     if(s.peek()<temperatures[i]){
        //         result[i] = s.size();
        //         while(!s.isEmpty()){
        //             s.pop();
        //         }

                
        //     }
        //     s.push(temperatures[i]);
        // }
        // return result;

        for(int i=0; i<temperatures.length; i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int index = s.pop();
                result[index] = i-index;
                
            }
            s.push(i);
            
        }
        return result;
    }
}