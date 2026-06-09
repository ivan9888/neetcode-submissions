class Solution {
    public String longestCommonPrefix(String[] strs) {
    
        boolean out = false;
        List<String> s=new ArrayList<>();
        for(int x=0;x<strs[0].length() && !out ;x++)
        {
            int count=0;
            for(int y=1;y<strs.length;y++)
            {
                if(x>=strs[y].length())
                {
                    out=true;
                    break;
                }
                if(strs[0].charAt(x)==strs[y].charAt(x))
                {count++;}
            }
            if(count==strs.length-1)
            {
                s.add(String.valueOf(strs[0].charAt(x)));
            }
            else
            {
                break;
            }
        }
        if(s.size()>0)
        {
            return String.join("",s);
        }
        return "";

    }
}