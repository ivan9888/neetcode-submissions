class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        tt=list(t)
        ss=list(s)
        tt.sort()
        ss.sort()
        if ss==tt:
            return True

        return False