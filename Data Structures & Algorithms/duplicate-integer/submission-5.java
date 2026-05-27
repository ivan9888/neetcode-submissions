class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> dictionary = new HashMap<>();
        
        for(int x:nums)
        {
            int value=dictionary.getOrDefault(x,0);
            if(value>0)
            {
                return true;
            }
            dictionary.put(x,value+1);
        }
        return false;
    }
}