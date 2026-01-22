class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length, sum = 0, diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (diff > Math.abs(target - (nums[i] + nums[j] + nums[k]))) {
                    diff = Math.abs(target - (nums[i] + nums[j] + nums[k]));
                    sum = (nums[i] + nums[j] + nums[k]);
                } else if ((nums[i] + nums[j] + nums[k]) > target) {
                    k--;
                } else {
                    j++;
                }

            }

        }
        return sum;

    }
}