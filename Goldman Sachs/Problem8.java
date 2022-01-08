/*
Goldman Sachs Problem-8

Solution by Aditya Kumar Jaiswal

Problem Statement: Total decoding messages

Solution is in java language
*/
class Problem8{
	public static void main(String[] args){
		String num = "12239104426";
		Solution sol = new Solution();
		System.out.println(sol.CountWays(num));
	}
}




class Solution
{
    public int CountWays(String str)
    {
        int[] count = new int[str.length()+1];
        count[0] = 1;
        count[1] = 1;
        if(str.charAt(0)== '0'){
            return 0;
        }
        for(int i=2; i<=str.length();i++){
            count[i] = 0;
            if(str.charAt(i-1) > '0'){
                count[i] = count[i-1];
                
            }
            if(str.charAt(i-2) == '1' || (str.charAt(i-2) == '2' && str.charAt(i-1) < '7')){
                count[i] += count[i-2];
            }
            count[i] = count[i]%1000000007;
        }
        return count[str.length()];   
    }   
}
