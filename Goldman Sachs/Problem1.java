/*
Goldman Sachs Problem-1
Solution by Aditya Kumar Jaiswal

Problem Statement: Print Anagrams Together
Given an array of strings, return all groups of strings that are anagrams. 
The groups must be created in order of their appearance in the original array.

Solution is in java language
*/

//Driver code
class Problem1 {
    public static void main(String[] args){
        Soluiton sol = new Solution();
        String[] str = {"act", "god", "cat", "dog" , "tac"};
        List<List<String>> result = sol.Anagrams(str);
        
        
        
    }
}

//Actual solution
class Solution {
    public String sortString(String s){
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        Map<String, List<String>> map = new HashMap<>();
        
        for(String ele: string_list){
            String key = sortString(ele);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(ele);
                map.put(key, list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(ele);
                map.put(key, list);
            }
        }
        List<List<String>> list = new ArrayList<>();
        for(String key: map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}
