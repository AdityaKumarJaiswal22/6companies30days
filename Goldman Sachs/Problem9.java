/*
Goldman Sachs Problem-9
Solution by Aditya Kumar Jaiswal

Problem Statement: Print Anagrams Together

Given an array of strings, return all groups of strings that are anagrams. 
The groups must be created in order of their appearance in the original array.

Solution is in java language
*/

class Problem9 {
  public static void main(String[] args) {
    try (Scanner scn = new Scanner(System.in)) {
      String str=  scn.next();
      
      String res = Solution.printMinNumberForPattern(str);
      System.out.println(res);
    }
  }
}



class Solution{
    static String printMinNumberForPattern(String S){
        Stack<Integer> st = new Stack<>();
        String res = "";
        int num=1;
        for(int i=0; i<S.length();i++){
            if(S.charAt(i) == 'D'){
                st.push(num);
                num++;
            }
            else{
                st.push(num);
                num++;
                while(!st.isEmpty()){
                    res += String.valueOf(st.peek());
                    st.pop();
                }
            }
        }
        st.push(num);
        while(!st.isEmpty()){
            res += String.valueOf(st.peek());
            st.pop();
        }
        
        return res;
    }
}
