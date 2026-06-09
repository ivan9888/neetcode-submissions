class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int x=0;x<details.length;x++)
        {
            String old=details[x].substring(11,13);
            if(Integer.parseInt(old) >60)
            {
                count++;
            }
        }
        return count;
    }
}