class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){return true;}
        if(t.length()<s.length()){return false;}
        int count=s.length();
        int z=0;
        for(int x=0;x<s.length();x++)
        {
            for(int y=z;y<t.length();y++)
            {
                if(s.charAt(x)==t.charAt(y))
                {
                    z=y+1;
                    count-=1;
                    if(count==0){return true;}
                    break;
                }
                
            }
        }
        return false;
        
    }
}