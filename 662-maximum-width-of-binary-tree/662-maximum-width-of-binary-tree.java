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

/*
left  -> pos*2
right -> pos*2 +1
            1
           / \
          2   3
         / \   \
        4   5   7
       /         \
      8           15
*/
class Solution {
    int max_width; // Storing the max width
    HashMap<Integer, Integer> leftmost_positions;  // <depth, max_width>
    public int widthOfBinaryTree(TreeNode root) {
        max_width = 0;
        leftmost_positions = new HashMap();
        get_width(root, 0, 0);
        return max_width;
    }
    
    public void get_width(TreeNode root, int depth, int position){
        if(root==null) return;
        leftmost_positions.computeIfAbsent(depth, x->position);
        
        // Updating the max_width if the next level(depth) has more "width" than the previous ones'
        // position - leftmost_positions.get(depth) + 1 -> eg. 7 - 4 + 1 = 4 (max_width)
        max_width = Math.max(max_width, position - leftmost_positions.get(depth) + 1);
        // Traversing the next level.. depth++(1,2,3,..), position left(1,2,4,8,...), position right(1,3,5,7,15,...)
        get_width(root.left, depth+1, position*2);
        get_width(root.right, depth+1, position*2 + 1);
    }
}