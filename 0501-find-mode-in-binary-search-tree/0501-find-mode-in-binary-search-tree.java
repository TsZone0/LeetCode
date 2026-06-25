class Solution {
    public int[] findMode(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        inorder(root, list);

        ArrayList<Integer> ans = new ArrayList<>();

        int maxFreq = 0;
        int currFreq = 0;
        Integer prev = null;

        for (int num : list) {

            if (prev == null || num != prev) {
                currFreq = 1;
            } else {
                currFreq++;
            }

            if (currFreq > maxFreq) {
                maxFreq = currFreq;
                ans.clear();
                ans.add(num);
            } else if (currFreq == maxFreq) {
                ans.add(num);
            }

            prev = num;
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}