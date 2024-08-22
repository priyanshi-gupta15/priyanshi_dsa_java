import java.util.ArrayList;
import java.util.Arrays;

public class recursion {
    public static void main(String[] args) {
        // fibonacci series;
        // int n=5;
        // System.out.println(fibo(n));



        // int[] arr={-1,0,3,5,9,12};
        // int target = 9;
        // System.out.println(BS(0, arr.length-1, arr, target));

        // series(5);
        // Revseries(5);
        // Bothseries(8);
        // =========================================================
        // factorial;
        // System.out.println(factorial(5));
        // =========================================================

        // sum;
        // System.out.println(sum(10));
        // =========================================================

        // sumofdigit;
        // System.out.println(sumer(99));
        // =========================================================

        // prodofdigit;
        // System.out.println(prodofdigit(99));
        // =========================================================

        // reversedigit;
        revdig(508);
         System.out.println(sum);
        // =========================================================

        // System.out.println(rev(1234));

        // System.out.println(pailandrome(45634));

        // countzeros;

        // System.out.println(countN(304004));

        // =========================================================
        // on single occurance
        // =========================================================
        // int[] arr = { 1, 3, 4, 2, 5, 7 };
        // int target = 4;
        // System.out.println(linsearch(arr, target, 0));

        // =========================================================
        // on multiple occurance
        // =========================================================
        // int[] arr = { 1, 4, 4, 4, 5, 7 };

        // int target = 4;
        // multivalue(arr, target, 0, list);
        // System.out.println(list);
        // System.out.println(multivalue(arr, target, 0, new ArrayList<>()));

        // =========================================================
        // taringle pattaen
        // =========================================================
        // traingle(5, 0);
        // =========================================================
        // reverse taringle pattaen
        // =========================================================
        // revtraingle(5, 0);
        // =========================================================
        // bubble sort
        // =========================================================
        // int[] arr = { 1, 4, 2, 5, 6 };
        // bubble(arr, arr.length - 1, 0);
        // System.out.println(Arrays.toString(arr));
        // =========================================================
        // selection sort
        // =========================================================
        // int[] arr = { 1, 4, 2, 5, 6, 8, 7, 0 };
        // selection(arr, arr.length, 0, 0);
        // updmergesort(arr,0,arr.length);
        // Quicksort(arr,0,arr.length-1);
        // System.out.println(Arrays.toString(arr));

    }

    static int fibo(int n)

    {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int BS(int st, int end, int[] arr, int target) {

        int mid = st + (end - st) / 2;
        if (st > end) {
            return -1;

        }
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return BS(mid + 1, end, arr, target);
        }
        return BS(st, mid - 1, arr, target);

    }

    static void series(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        series(n - 1);
    }

    static void Revseries(int n) {
        if (n == 0) {
            return;
        }

        Revseries(n - 1);
        System.out.println(n);
    }

    static void Bothseries(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        Bothseries(n - 1);
        System.out.println(n);
    }

    static int factorial(int n)

    {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * (factorial(n - 1));

    }

    static int sum(int n)

    {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n + (sum(n - 1));

    }

    static int sumer(int n)

    {
        if (n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumer(n / 10);

    }

    static int prodofdigit(int n)

    {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * prodofdigit(n / 10);

    }

    static int sum = 0;

    static void revdig(int n)

    {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        revdig(n / 10);

    }

    static int rev(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int pailandrome(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        int reve = helper(n, digits);
        if (n == reve) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    static int countN(int n) {
        return helper2(n, 0);
    }

    static int helper2(int n, int c) {

        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }

    // =========================================================
    // BY BOOLEAN FUNCTION
    // =========================================================

    static boolean search(int[] arr, int target, int index)

    {
        if (index > arr.length - 1) {
            return false;
        }

        return (arr[index] == target) || search(arr, target, index + 1);

    }
    // =========================================================
    // BY INT FUNCTION
    // =========================================================

    static int linsearch(int[] arr, int target, int index)

    {
        if (index > arr.length - 1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        } else {

            return linsearch(arr, target, index + 1);
        }

    }

    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> multivalue(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index > arr.length - 1) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return multivalue(arr, target, index + 1, list);

    }

    static void traingle(int row, int cln) {

        if (row == 0) {
            return;
        }
        if (cln < row) {
            System.out.print(" * ");
            traingle(row, cln + 1);
        } else {
            System.out.println();
            traingle(row - 1, 0);
        }

    }

    static void revtraingle(int row, int cln) {

        if (row == 0) {
            return;
        }
        if (cln < row) {

            revtraingle(row, cln + 1);
            System.out.print(" * ");
        } else {

            revtraingle(row - 1, 0);
            System.out.println();
        }

    }

    static void bubble(int[] arr, int row, int cln) {

        if (row == 0) {
            return;
        }
        if (cln < row) {

            if (arr[cln] > arr[cln + 1]) {
                int temp = arr[cln];
                arr[cln] = arr[cln + 1];
                arr[cln + 1] = temp;
            }

            bubble(arr, row, cln + 1);
        } else {

            bubble(arr, row - 1, 0);
        }

    }

    static void selection(int[] arr, int row, int cln, int max) {

        if (row == 0) {
            return;
        }
        if (cln < row) {

            if (arr[cln] > arr[max]) {
                selection(arr, row, cln + 1, cln);

            } else {
                selection(arr, row, cln + 1, max);
            }
            // selection(arr, row, cln+1, max);
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selection(arr, row - 1, 0, 0);
        }

    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);

    }

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // when the 1 condition is false then let in any one array the numbers are left
        // over then we check ;
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;

        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;

        }
        return mix;

    }

    static void updmergesort(int[] arr, int s, int e) {
        if (e-s == 1) {
            return ;
        }
        int mid = (s+e) / 2;

             updmergesort(arr, s, mid);
            updmergesort(arr, mid, e);

             updmerge(arr,s,mid,e);

    }

    /**
     * @param arr
     * @param s
     * @param m
     * @param e
     */
    private static void updmerge(int[] arr, int s, int m, int e) {

        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {

            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // when the 1 condition is false then let in any one array the numbers are left
        // over then we check ;
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;

        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;

        }
        for (int l = 0; l <mix.length; l++) {
            arr[s+l]=mix[l];
            
        }

        

    }
    static void Quicksort(int[] nums , int low , int high)
    {
        if(low>=high)
        {
            return;
        }
        int s= low;
        int e = high;
        int m = s+(e-s)/2;
        int pivot = nums[m];
        while (s<=e) {

            // also a reason why if its already sorted it will not swap

            while(nums[s]<pivot)

            {
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }
            if(s<=e)
            {
                int temp = nums[s];
                nums[s]= nums[e];
                nums[e]=temp;
                s++;
                e--;

            }
            
        }
        Quicksort(nums,low,e);
        Quicksort(nums,s,high);
    }

}
