class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dicc={}
        lista=[]
        frequent_num=[]
        for num in nums:
            if num not in dicc:
                dicc[num]=1
            else:
                dicc[num]+=1
        for num in dicc:
            lista.append((dicc[num],num))
        for x in range(k):
            m=max(lista)
            frequent_num.append(m[1])
            lista.remove(max(lista))
        return frequent_num