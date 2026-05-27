class Solution {
    public int[] replaceElements(int[] arr) {
        int[] nums=new int[arr.length];
        int max=-1;

        for(int x=arr.length-1;x>=0;x--)
        {
            nums[x]=max;
            max=Math.max(max,arr[x]);
        }
        return nums;
    }
}