class Solution {
    public int[] replaceElements(int[] arr) {
        int size=arr.length;
        int[] nums=new int[size];
        int max=-1;

        for(int x=size-1;x>=0;x--)
        {
            nums[x]=max;
            max=Math.max(max,arr[x]);
        }
        return nums;
    }
}