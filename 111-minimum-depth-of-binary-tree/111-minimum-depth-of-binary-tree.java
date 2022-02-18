/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        
        // leaf node
        if(root.left == null && root.right == null) return 1;
        
		int left = minDepth(root.left);
        int right = minDepth(root.right);
		
        if(root.left == null) return right + 1; // leaf nodes are in right subtree
        if(root.right == null) return left + 1; // leaf nodes are in left subtree

        // left/right subtrees both contains leaf nodes
        return Math.min(left, right) + 1;
    }
}