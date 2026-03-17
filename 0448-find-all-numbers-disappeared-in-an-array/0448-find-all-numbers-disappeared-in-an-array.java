import java.util.*;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        int n = 1;

        for(int i = 0; i < nums.length; i++){

            while(n < nums[i]){
                list.add(n);
                n++;
            }

            if(nums[i] == n){
                n++;
            }
        }

        while(n <= nums.length){
            list.add(n);
            n++;
        }

        return list;
    }
}