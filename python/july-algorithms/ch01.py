class Solution:
    @staticmethod
    def max_sub_array(nums):
        e = len(nums)
        ans = nums[0]
        sum_ = 0
        for i in range(e):
            sum_ += nums[i]
            if sum_ > ans:
                ans = sum_
            if sum_ < 0:
                sum_ = 0
        return ans


# lst = [-1,-2,3,-4,-5,6]
lst = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
ans1 = Solution.max_sub_array(3, lst)
print(ans1)
