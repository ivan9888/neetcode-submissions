class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        convertir=set(nums)
        if len(convertir)==len(nums):
            return False
        return True
        