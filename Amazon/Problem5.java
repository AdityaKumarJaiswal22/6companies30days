class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        String temp = "";
        
        for(int i=0;i<s.length();i++){
            temp = temp + s.charAt(i);
            ArrayList<String> arr = new ArrayList<>();
            Set<String> set = new HashSet<>();
            for(int j=0;j<n;j++){
                int l = contact[j].indexOf(temp);
                if(l == 0){
                    set.add(contact[j]);
                }
            }
            
            if(!set.isEmpty()){
                for(String st: set){
                    arr.add(st);
                }
                res.add(arr);
            }
            else{
                arr.add("0");
                res.add(arr);
            }
        }
        return res;
    }
}
