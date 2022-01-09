/*
Goldman Sachs Problem-10
Solution by Aditya Kumar Jaiswal

Problem Statement: Find max 10 numbers in a list having 10M entries.
Solution is in java language
*/

class Problem10
{
    public static int[] findMax(int[] n){
        int[] arr = new int[10];
        Arrays.sort(n);
        int j = 0;
        for(int i=9999999;i>9999999-10;i--){
            arr[j++] = n[i];

        }
        return arr;
    }
    public static void main(String[] args) {

        int[] n = new int[10000000];
        for(int i=0;i<n.length;i++){
            n[i] = i*2;
        }
        int[] arr = findMax(n);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

}
