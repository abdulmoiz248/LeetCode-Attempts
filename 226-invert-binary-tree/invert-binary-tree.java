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
    public TreeNode invertTree(TreeNode root) {
       if(root==null) return root;
       
       if(root.left==null && root.right==null)
              return root;
       else if(root.left==null)
        {
            root.left=invertTree(root.right);
            root.right=null;
        } 
        else if(root.right==null)
        {
            root.right=invertTree(root.left);
            root.left=null;
            //System.out.println(root.)
        } else{
           TreeNode node=root.right;
         //  root.left=root.right
        //   root.right=node;
         root.right=invertTree(root.left);
         root.left=invertTree(node);
                   
        }
        return root;
    }
}