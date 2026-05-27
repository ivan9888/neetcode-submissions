class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }
        int[] alph=new int[26];
        int a=(int)'a';
        for (int x=0;x<s.length();x++)
        {
            alph[(int)s.charAt(x)-a]+=1;
            alph[(int)t.charAt(x)-a]-=1;
        }
        for(int x=0;x<alph.length;x++)
        {
            if(alph[x]!=0)
            {
                return false;
            }
        }
        return true;
    }
}
