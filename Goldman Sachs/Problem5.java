


class Problem5{
	public static void main(String[] args){
		int n = 10;
		Solution sol = new Solution();
		System.out.println(sol.getNthUglyNo(n));
	}
}

class Solution {
    /* Function to get the nth ugly number*/
    long getNthUglyNo(int n) {
        long dp[] = new long[n+1];
        dp[1] = 1;
        int p1 = 1;
        int p2 = 1;
        int p3 = 1;
        for(int i=2;i<=n;i++){
            long val1 = dp[p1]*2;
            long val2 = dp[p2]*3;
            long val3 = dp[p3]*5;
            long min = Math.min(val1, Math.min(val2, val3));
            dp[i] = min;
            if(min == val1){
                p1++;
            }
            if(min == val2){
                p2++;
            }
            if(min == val3){
                p3++;
            }
        }
        return dp[n];
        
    }
}
