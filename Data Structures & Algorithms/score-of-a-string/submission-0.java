class Solution {
    public int scoreOfString(String s) {
        int suma=0;
        for(int x=0;x<s.length()-1;x++)
        {
            suma+=Math.abs((int)s.charAt(x+1)-(int)s.charAt(x));
        }
        return suma;
    }
}