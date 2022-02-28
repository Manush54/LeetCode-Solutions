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
 
 Main IDEA:-
 
 Similar to Two Sum I
 Create a HashSet
 Traverse the tree and check if the (target - root.val) is present in the HashSet, 
    if yes: return true
    if not: check for the next left OR right values
end
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet();
        return dfs(root, set, k);
    }
    
    public boolean dfs(TreeNode root, HashSet set, int target){
        if(root == null) return false;
        if(set.contains(target - root.val)) return true;
        set.add(root.val);
        // Return true if either of the method calls return true.
        return dfs(root.left, set, target) || dfs(root.right, set, target);
    }
}