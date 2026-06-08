class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}

        int[] word=new int[26];
        for(int x=0;x<s.length();x++)
        {
            word[(int)s.charAt(x)-(int)'a']+=1;
            word[(int)t.charAt(x)-(int)'a']-=1;
        }    
        for(int x:word)
        {
            if(x!=0)
            {return false;}

        }  
        return true;
    }
}
