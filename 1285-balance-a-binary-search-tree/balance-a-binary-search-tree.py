# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def balanceBST(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: Optional[TreeNode]
        """
        def inorder(root):
            if root is None:
               return []
            return inorder(root.left)+[root.val]+inorder(root.right)
        
        def balanceTree(arr):
            if not arr: return None
            mid=len(arr)//2
            root=TreeNode(val=arr[mid])
            root.left=balanceTree(arr[:mid])
            root.right=balanceTree(arr[mid+1:])
            return root
            

        
        arr=inorder(root)
        print(arr)
        root=balanceTree(arr)
        return root

            

        