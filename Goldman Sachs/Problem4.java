/*
Goldman Sachs Problem-4
Solution by Aditya Kumar Jaiswal

Problem Statement: Run Length Encoding
Given a string, Your task is to  complete the function encode that returns the run length encoded string for the given string.
eg if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6″.
You are required to complete the function encode that takes only one argument the string which is to be encoded and returns the encoded string.
Solution is in java language
*/

//Driver code
class Problem4 {
	public static void main(String[] args){
		String str = "wwwaaaackkkk";
		Soltion s = new Solution();
		String result = s.encode(str);
		System.out.println(result);
	}
}



class Solution
 {
	String encode(String str)
	{
          StringBuilder s = new StringBuilder();
          int i = 0;
          
          
          while(i < str.length()){
              char c = str.charAt(i);
              int count = 1;
              while(i < str.length()-1 && c == str.charAt(i+1)){
                  count++;
                  i++;
              }
              s.append(c);
              s.append(count);
              i++;
          }
          return s.toString();
          
	}
	
 }
