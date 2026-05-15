class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for x in range(len(nums)-1):
            for y in range(x,len(nums)-1):
                if nums[x]+nums[y+1]==target:
                    return [x,y+1]
        return None
