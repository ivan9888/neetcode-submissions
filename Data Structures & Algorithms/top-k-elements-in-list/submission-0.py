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
        lista=sorted(lista,reverse=True)
        for x in range(k):
            frequent_num.append(lista[x][1])
        return frequent_num