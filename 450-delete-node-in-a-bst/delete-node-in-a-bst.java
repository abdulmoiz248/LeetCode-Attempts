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
    public TreeNode deleteNode(TreeNode root, int key) {
      if(root!=null)  
         if(root.val<key) root.right=deleteNode(root.right,key);
         else if(root.val>key) root.left=deleteNode(root.left,key);
         else{
             if(root.left==null && root.right==null) return null;

             if(root.right==null) return root.left;
             else if(root.left==null) return root.right;

             TreeNode is=root.right;
             while(is.left!=null) is=is.left;
             root.val=is.val;
             root.right=deleteNode(root.right,is.val);

         }   
         return root;
    }
}