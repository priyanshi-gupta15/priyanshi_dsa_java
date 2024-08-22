public class bitwise {
    // Ques 1
    // find no is odd or even
    // Ques 2
    // print distict value applicable only if same number not more than twice time like 2,2,4,4,5   xx 2,3,2,3,2,4,3 xx
    // Ques 3
    // print ith bit
    // que 4;
    // set ith bit;
    // que5;
    // reset the ith bit
    // 6th
    // position of right most bit;
    // que 7
    // find ythe number that only apperance once;

    public static void main(String[] args) {
        // q1;
        // int n=60;
        // System.out.println(iseven(n));


        // q2;
        // int[] arr ={2,3,8,7,7,4,8,3,2 };
        // System.out.println(ans(arr));


        // q3;
        // int n=8;
        // int k=4;
        // //find which bit 1010;
        // System.out.println(isone(n,k));


        // que4;
        // int n=10;
        // int k=3;
        // System.out.println(setbit(n,k));

        // que5;
        // int n=15;
        // int k=3;
        // System.out.println(setbitto0(n,k));

        // que6;
        // int n=10;
        // System.out.println(position(n));
        //

        // que7;
        // int[] arr = { 2,2,3,3,2,8,3};
        // System.out.println(search(arr));
        // not complete que 7;
        
        // que 8 already done

        // que 9 amzone que
        // int n=5;
        // int base=5;
        // int ans=0;
        // while(n>0)
        // {
        // int last =n&1;
        // n=n>>1;
        // ans+= base * last;
        // base = base * 5;
        // }
        // System.out.println(ans);

        //que 10  find bits in particular number
        // int n=10;
        // int b=2;
        // int ans = (int) (Math.log(n)/ Math.log(b))+1;
        // System.out.println(ans);




        // que11
        // pasccle triangle
        // sum of nth row;

        // we know that nC0 +nC1+nC2.......nCn= 2 power n
        // for nth row = 2 power n-1;
        // int n=10;
        // int ans =1<<(n);
        // System.out.println(ans-1);

        // que12;
        // is power of 2
        // int i = 48;
        // System.out.println(power(i));


        //que13;
        //
    }

    static boolean power(int i) {
        return (i & (i - 1)) == 0;
    }

    // =======================

    @SuppressWarnings("unused")
    private static boolean iseven(int n) {
        return (n & 1) == 0;
    }

    @SuppressWarnings("unused")
    private static int ans(int[] arr)

    {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
            // properties:
            // a^a=0;
            // a^0=a;
            // a^1=a(bar)

        }
        return unique;

    }

    @SuppressWarnings("unused")
    private static boolean isone(int n, int k)

    {
        return ((n & (1 << (k - 1))) >> (k - 1)) == 1;
        // not complete;

    }

    static int setbit(int n, int k) {
        return ((1 << k - 1) | n);
    }

    static int setbitto0(int n, int k) {
        return ((~(1 << k - 1)) & n);
    }

    static int position(int n) {
        return (n & (-n));
    }

    static int search(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum % arr.length-1;
    }

}

// Ques 1
// find no is odd or even
// Ques 2
// print distict value
// Ques 3
// print ith bit
// que 4;
// set ith bit;
// que5;
// reset the ith bit
// 6th
// position of write most bit;
