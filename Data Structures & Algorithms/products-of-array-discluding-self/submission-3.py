class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
      left_product=[1]*len(nums)
      right_product=[1]*len(nums)
      final_product=[1]*len(nums)
      temp_product=0 if nums[0]==0 else nums[0]
      for x in range(1,len(nums)):
        left_product[x]=temp_product
        temp_product*=nums[x]
      temp_product=0 if nums[-1]==0 else nums[-1]
      for x in range(len(nums)-2,-1,-1):
        right_product[x]=temp_product
        temp_product*=nums[x]
      for x in range(len(nums)):
        final_product[x]=right_product[x]*left_product[x]
      return final_product