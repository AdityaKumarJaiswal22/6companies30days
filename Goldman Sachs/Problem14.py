#Problem 14
#Minimum Size Subarray Sum
#Given an array of positive integers nums and a positive integer target, 
#return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. 
#If there is no such subarray, return 0 instead.





print(minSubArrayLen(7, [1, 2, 4, 3, 2, 2]))


def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        j = 0
        i = 0
        temp = 0
        res = float("inf")
        while(j<len(nums)):
            temp += nums[j]
            if(temp >= target):
                while(temp >= target):
                    res = min(res, j-i+1)
                    temp -= nums[i]
                    i += 1
            
            j += 1
        if(res == float("inf")):
            return 0
        else:
            return res
