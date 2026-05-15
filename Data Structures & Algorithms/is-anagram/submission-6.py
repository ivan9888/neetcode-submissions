class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        abc=[0]*26
        first=ord('A')
        sum=0
        s=s.upper()
        t=t.upper()
        for x in range(len(s)):
            abc[ord(s[x])-first]+=1
            abc[ord(t[x])-first]-=1
        for x in abc:
            if x!=0:
                return False
        return True
