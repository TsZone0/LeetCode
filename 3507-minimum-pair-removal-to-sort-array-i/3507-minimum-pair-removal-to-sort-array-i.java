class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<>();

       for (int i = 0; i < nums.length; i++) {
            arr.add(nums[i]);
        }

        int oprations =0;

        while(!isshorted(arr)){
            int idx =0;
            int minsum = arr.get(0)+arr.get(1);

            for(int i=0; i<arr.size()-1;i++){
                int sum = arr.get(i)+arr.get(i+1);

                if(minsum>sum){
                    minsum = sum;
                    idx = i;
                }
            }

            //merge
            int merge = arr.get(idx)+arr.get(idx+1);
            arr.set(idx,merge);
            arr.remove(idx+1);
            oprations++;
        }
            return oprations;
    }
         private boolean isshorted(ArrayList<Integer> arr){
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i)<arr.get(i-1)){
                return false;
            }
        }
        return true;
     }
}