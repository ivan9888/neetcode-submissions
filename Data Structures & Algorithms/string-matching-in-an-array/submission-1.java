class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> list=new HashSet<>();
        for(int x=0;x<words.length-1;x++)
        {
            for(int y=x+1;y<words.length;y++)
            {
                if(words[x].length()>words[y].length())
                {
                    if(words[x].contains(words[y]))
                    {
                        list.add(words[y]);
                    }
                }
                else
                {
                    if(words[y].contains(words[x]))
                    {
                        list.add(words[x]);
                    }
                }
            }
        }
        return new ArrayList<>(list);
        
    }
}