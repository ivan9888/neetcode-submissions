class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int temp=0,count=0;

        for(int x:nums)
        {
            if(x==1)
            {
                count++;
                if (count>temp)
                {
                    temp=count;
                }
            }
            else
            {
                count=0;
            }
        }
        return temp;
    }
}