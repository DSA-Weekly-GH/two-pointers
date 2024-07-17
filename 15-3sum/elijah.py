class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        res_set = set()
        res = []

        for i, e in enumerate(nums):
            diff = 0 - e
            l, r = i+1, len(nums) - 1   
            while l < r:
                diff_sum = nums[l] + nums[r]
                if diff_sum < diff:
                    l += 1
                elif diff_sum > diff:
                    r -= 1
                else:
                    if (e, nums[l], nums[r]) not in res_set:
                        res.append([e, nums[l], nums[r]])
                        res_set.add((e, nums[l], nums[r]))
                    r -=1
        return res