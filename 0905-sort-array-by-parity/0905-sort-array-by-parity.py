class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        ind = 0
        ans =[]
        for i in nums:
            if i%2==0:
                ans.insert(ind,i)
                ind+=1
            else:
                ans.insert(ind,i)
                
        return ans
            