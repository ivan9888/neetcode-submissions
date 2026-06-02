class Solution {
    public int appendCharacters(String s, String t) {
        int temp=0;
        int counter=t.length();
        for(int x=0;x<s.length();x++)
        {
            if(temp<t.length() && s.charAt(x)==t.charAt(temp))
            {
                counter--;
                temp++;
            }
        }
        return counter;
    }
}