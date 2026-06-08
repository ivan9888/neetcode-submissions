class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> s= Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (nums.length!=s.size()){
            return true;
        }
        return false;

    }
}