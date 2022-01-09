



public class Problem11 {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());

            String[] str = br.readLine().split(" ");

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {

                a[i] = Integer.parseInt(str[i]);

            }

            int[] ans = new Solve().findTwoElement(a, n);

            System.out.println(ans[0] + " " + ans[1]);

        }

    }

}

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int[] count = new int[n+1];
        int[] res = new int[2];
        for(int ele: arr){
            count[ele]++;
        }
        for(int i = 1; i<= n; i++){
            if(count[i] == 2){
                res[0] = i;
            }
            if(count[i] == 0){
                res[1] = i;
            }
        }
        return res;
    }
}
