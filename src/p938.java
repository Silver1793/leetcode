class Solution {
    int total = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root, low, high);
        return total;
    }

    public void helper(TreeNode root, int low, int high) {
        if (root == null) {
            return;
        }
        if (root.val >= low && root.val <= high) {
            System.out.println(root.val);
            total += root.val;
        }
        helper(root.left, low, high);
        helper(root.right, low, high);
    }
}