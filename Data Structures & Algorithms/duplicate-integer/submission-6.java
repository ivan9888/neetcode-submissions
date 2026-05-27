class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int x:nums)
        {
            if(list.contains(x))
            {
                return true;
            }
            list.add(x);
        }
        return false;
    }
}