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
class FindElements {
    TreeNode node; 
    HashSet <Integer> set=new HashSet<>();
    public FindElements(TreeNode root) {
        if(root==null) return;
        root.val=0;
        this.node=assignValues(root);
        printTree(this.node);
    }
    private TreeNode assignValues(TreeNode root){
        if(root==null) return null;
        set.add(root.val);
        if (root.left!=null){
          root.left.val=2*root.val+1;

          assignValues(root.left);
          
        }
        if (root.right!=null){
          root.right.val=2*root.val+2;
        
          assignValues(root.right);
        }
        return root;
    }
    private void printTree(TreeNode root){
        if(root==null) return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }
    
    public boolean find(int target) {
      return set.contains(target);
    }
   
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */