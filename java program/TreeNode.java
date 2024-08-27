class LeetcodeQ9 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        return root.val == subRoot.val && isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        return isIdentical(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        LeetcodeQ9 solution = new LeetcodeQ9();

        // Example usage:
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5, null, new TreeNode(2, new TreeNode(0), null))
        );

        TreeNode subRoot = new TreeNode(2, new TreeNode(1), new TreeNode(0));

        System.out.println(solution.isSubtree(root, subRoot));  // Output: true
    }
}
