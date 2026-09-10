class Solution(object):
    def averageOfSubtree(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        
        def count_and_avg(root):
            if root == None:
                return [0, 0, 0]

            sum_left, count_left, final_ans_left = count_and_avg(root.left)
            
            sum_right, count_right, final_ans_right = count_and_avg(root.right)
            
            sumz = root.val + sum_left + sum_right
            count = count_left + count_right + 1
            final_ans = final_ans_right + final_ans_left

            if root.val == sumz // count:
                final_ans += 1 
            
            return [sumz, count, final_ans]
        
        return count_and_avg(root)[2]

