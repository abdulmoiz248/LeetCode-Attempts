public class BinaryTree {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean evaluateTree(TreeNode root) {
       if(root.right==null && root.left==null)
       {
           if(root.val==1) return true;
           return false;
       }
       if(root.val==2) {
           if(!evaluateTree(root.left))
               if(!evaluateTree(root.right))
                   return false;
           return true;
       }
        if(root.val==3) {
            if(evaluateTree(root.left))
                if(evaluateTree(root.right))
                    return true;
            return false;
        }
        System.out.println("Excuted end");
        return false;
    }
}
