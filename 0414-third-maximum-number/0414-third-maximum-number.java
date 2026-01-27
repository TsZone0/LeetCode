class Solution {
    public int thirdMax(int[] nums) {
     
     ArrayList<Integer> list = new ArrayList<>();
     for(int i=0; i<arr.length; i++){
        list.add(nums[i]);
     }

     Collections.sort(list);

     if(list.size()==2){
        return list.get(0);
     }

     else{
        return list.get(list.size()-2);
     }

    }
}