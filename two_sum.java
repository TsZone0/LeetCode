public class two_sum {

    public static int[] twoSum(int[] nums, int target) { // made static
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int nums[] = {2, 4, 3, 5, 6};
        int target = 6;

        int[] result = twoSum(nums, target); // call method

        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found");
        }
    }
}
