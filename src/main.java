class CatalnNumber {

    // A recursive function to find nth catalan number

    int catalan(int n) {
        int res = 0;

        // Base case
        if (n <= 1) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - i - 1);
    }
        return res;
    }
   public static long catalan_dynamic(int n){
        int i, j;
       long[] catalan = new long[n+1];
       catalan[0]=1;
        for(i = 1 ; i <= n ; i++){
            catalan[i] = 0;
            for(j = 0 ; j < i ; j++)
                catalan[i] += catalan[j] * catalan[i - j - 1];
        }
        return catalan[n];
    }
    public static void main(String[] args) {
        CatalnNumber cn = new CatalnNumber();
        for (int i = 0; i < 10; i++) {
            System.out.print(cn.catalan(i) + " ");

        }

        System.out.print("\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(catalan_dynamic(i) + " ");

        }

    }


}
