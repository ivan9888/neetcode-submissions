class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
      dicc={}
      for word in strs:
        char_list=[0]*26
        for char in word:
          char_list[ord(char)-ord('a')]+=1
        tuple_word=tuple(char_list)
        if tuple_word not in dicc:
          dicc[tuple_word]=[word]
        else:
          dicc[tuple_word].append(word)
      return list(dicc.values())

        