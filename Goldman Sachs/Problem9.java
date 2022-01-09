/*
Goldman Sachs Problem-9
Solution by Aditya Kumar Jaiswal

Problem Statement: Number following a pattern 

Given a pattern containing only I's and D's. I for increasing and D for decreasing.
Devise an algorithm to print the minimum number following that pattern.
Digits from 1-9 and digits can't repeat.

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
