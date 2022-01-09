/*
Goldman Sachs Problem-6

Solution by Aditya Kumar Jaiswal

Problem Statement: Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).
Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Solution is in java language
*/

public class Problem6 {

    public static void main(String[] args) {

        try (Scanner scn = new Scanner(System.in)) {

            String str1 = scn.nextLine();

            String str2 = scn.nextLine();

            String res = Solution.gcdOfStrings(str1,str2);

            System.out.println(res);
		}
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        //System.out.println(str1 +" " + str2);
        if(n2 > n1){
            return gcdOfStrings(str2, str1);
        }
        if(n1 == n2){
            if(str1.equals(str2)){
                return str1;
            }
            else{
                return "";
            }
        }
        if(str1.startsWith(str2)){
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }
        return "";
    }
}
