/*
Goldman Sachs Problem-3
Solution by Aditya Kumar Jaiswal

Problem Statement: Count the subarrays having product less than k 

Given an array of positive numbers, the task is to find the number of possible contiguous subarrays having product less than a given number k. 

Solution is in java language
*/
class Problem3{
	public static void main(String[] args){
		long n = 4;
		long[] a = new long[n];
		long k = 10;
		Solution sol = new Solution();
		System.out.println(sol.countSubArrayProductLessThanK(a, n, kk));
	}
}



class Solution {
    
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        long product = 1;
        int i = 0;
        int j = 0, ans=0;
        while(j < n){
            product *= a[j];
            if(product >= k){
                while(i <= j && product >= k){
                    product /= a[i];
                    i++;
                }
            }
            ans += j-i+1;
            j++;
        }
        return ans;
        
    }
}
