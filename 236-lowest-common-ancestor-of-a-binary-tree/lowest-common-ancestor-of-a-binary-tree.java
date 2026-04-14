/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode lca;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        traversal(root, p, q);
        return lca;
    } 

    public int traversal(TreeNode curr, TreeNode a, TreeNode b){
        int count = 0;
        if(curr==null) return 0;
        int ansOnLeft = traversal(curr.left, a, b);
        int ansOnRight = traversal(curr.right, a, b);
        count = ansOnLeft+ansOnRight+count;
        if(curr.val== a.val || curr.val==b.val){
            count++;
        }
        if(count==2 && lca==null){
            lca = curr;
        }
        return count;
    }
}