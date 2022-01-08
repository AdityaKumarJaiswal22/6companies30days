/*
Goldman Sachs Problem-13
Solution by Aditya Kumar Jaiswal

Problem Statement: Decode the string

An encoded string (s) is given, the task is to decode it. The pattern in which the strings were encoded were as follows
original string: abbbababbbababbbab 
encoded string : 3[a3[b]1[ab]]

Solution is in java language
*/
class Problem13{
	public static void main(String[] args){
		String s = "3[b2[ac]]";
		Solution sol = new Solution();
		System.out.println(sol.decodeString(s));
	}
}




class Solution{
    static boolean number(char c){
        return (c >= '0' && c <= '9');
    }
    
    static String decodedString(String s){
        String num = "", ans = "";
        int n;
        String temp="", temp2="";
        Stack<Character> st = new Stack<>();
        int p=0;
        
        while(p<s.length()){
            if(s.charAt(p) == ']'){
                while(st.peek() != '['){
                    temp = st.peek() + temp;
                    st.pop();
                }
                st.pop(); // remove '['
                while(number(st.peek())){
                    num = st.peek() + num;
                    st.pop();
                    if(st.isEmpty()){
                        break;
                    }
                }
                n = Integer.parseInt(num);
                for(int i=1;i<=n;i++){
                    temp2 = temp2 + temp;
                }
                if(st.isEmpty()){
                    ans = temp2;
                    break;
                }
                for(int i=0;i<temp2.length();i++){
                    st.push(temp2.charAt(i));
                }
                temp = "";
                temp2 ="";
                num = "";
                
            }
            else{
                st.push(s.charAt(p));
            }
            p++;
        }
        return ans;
        
    }
}
