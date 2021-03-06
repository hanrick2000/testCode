package lin.E2_20150804;

/**
 * Created by Paul on 8/3/15.
 * http://www.lintcode.com/en/problem/maximum-depth-of-binary-tree/
 * http://www.cnblogs.com/springfor/p/3879619.html
 */
//
//Maximum Depth of Binary Tree
//
//        55% Accepted
//        Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//        Have you met this question in a real interview? Yes
//        Example
//        Given a binary tree as follow:
//
//        1
//        / \
//        2   3
//        / \
//        4   5
//        The maximum depth is 3.


public class E97MaxDepthOfBT {
    /**
     * Definition of TreeNode:
     * public class TreeNode {
     *     public int val;
     *     public TreeNode left, right;
     *     public TreeNode(int val) {
     *         this.val = val;
     *         this.left = this.right = null;
     *     }
     * }
     */
    public class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }
        /**
         * @param root: The root of binary tree.
         * @return: An integer.
         */
        public int maxDepth(TreeNode root) {
            // write your code here
            if (root == null) {
                return 0;
            }

            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
}


//solution 2
//public int maxDepth(TreeNode root) {
//        if(root == null)
//        return 0;
//
//        int depth = 0;
//        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.add(root);
//        int curNum = 1; //num of nodes left in current level
//        int nextNum = 0; //num of nodes in next level
//        while(!queue.isEmpty()){
//        TreeNode n = queue.poll();
//        curNum--;
//        if(n.left!=null){
//        queue.add(n.left);
//        nextNum++;
//        }
//        if(n.right!=null){
//        queue.add(n.right);
//        nextNum++;
//        }
//        if(curNum == 0){
//        curNum = nextNum;
//        nextNum = 0;
//        depth++;
//        }
//        }
//        return depth;
//        }