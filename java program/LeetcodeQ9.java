public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryBuilder {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
}

class LeetcodeQ9 {
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        return root.val == subRoot.val && isIdentical(root.left, root.right) && isIdentical(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        return root.val == subRoot.val && isIdentical(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String args[]) {
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int[] subnode = {2, 4, 5};
        BinaryTree.BinaryBuilder treeBuilder = new BinaryTree.BinaryBuilder();
        BinaryTree.Node root = treeBuilder.buildTree(node);
        BinaryTree.Node subRoot = treeBuilder.buildTree(subnode);

        LeetcodeQ9 solution = new LeetcodeQ9();
        if (solution.isSubtree(root, subRoot)) {
            System.out.println("The second tree is a subtree of the first tree.");
        } else {
            System.out.println("The second tree is not a subtree of the first tree.");
        }
    }
}
