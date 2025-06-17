

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_sequence {
    public static void main(String[] args) {
        // =====================================================================//
        // Q1(i):- skip a charter
        // =====================================================================//
        // String up= "bbaccb";

        // skip(pr,up);
        // System.out.println(skip(up)); //when use string return type
        // =====================================================================//
        // Q1(ii):- skip a string;
        // =====================================================================//
        // String up= "bbapplbappleccb";
        // System.out.println(skipall(up));
        // =====================================================================//
        // Q2:- skip a specific string ;
        // =====================================================================//
        // String up= "bbapplbappleccb";
        // System.out.println(skipnotapple(up));
        // =====================================================================//
        // Q3:- print all subset;
        // =====================================================================//
        // String up= "aaabbc";
        // subseq( "",up);
        // =====================================================================//
        // Q4:- print all subset in arrray list;
        // =====================================================================//
        // String up= "497";
        // System.out.println( subseqret( "",up));

        // ====================================================//
        // int[] arr = { 1, 2, 2 };
        // List<List<Integer>> ans = subsetiterationdup(arr);
        // for (List<Integer> list : ans) {
        // System.out.println(list);
        // }

        // ====================================================//
        // permutation
        // =======================================================//
        // =========================================================//
        System.out.println(permutationint("", "abcde"));
        // ====================================================//
        // permutation list
        // =======================================================//

        // ArrayList<String> list= permutationlist("", "abcd");
        // System.out.println(list);
    }

    static void skip(String pr, String up) {
        if (up.isEmpty()) {
            System.out.println(pr);

            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(pr, up.substring(1));
        } else {
            skip(pr + ch, up.substring(1));
        }
    }
    // =====================================================================//
    // =====================================================================//

    static String skip(String up) {
        if (up.isEmpty()) {

            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }
    // =====================================================================//
    // =====================================================================//

    static String skipall(String up) {
        if (up.isEmpty()) {

            return "";
        }

        if (up.startsWith("apple")) {
            return skipall(up.substring(5));
        } else {
            return up.charAt(0) + skipall(up.substring(1));
        }
    }
    // =====================================================================//
    // =====================================================================//

    static String skipnotapple(String up) {
        if (up.isEmpty()) {

            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipnotapple(up.substring(3));
        } else {
            return up.charAt(0) + skipnotapple(up.substring(1));
        }
    }

    // static int c=0;
    // =====================================================================//
    // =====================================================================//
    static void subseq(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            // System.out.println(c++);

            return;
        }
        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));

        subseq(p, up.substring(1));

    }

    // =====================================================================//
    // =====================================================================//
    static ArrayList<String> subseqret(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subseqret(p + ch, up.substring(1));
        ArrayList<String> right = subseqret(p, up.substring(1));

        left.addAll(right);
        return left;

    }

    // with iteration or without recursion
    static List<List<Integer>> subsetiteration(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;

    }

    // with iteration or without recursion with duplicate
    static List<List<Integer>> subsetiterationdup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[i]);
                outer.add(internal);

            }
        }
        return outer;

    }

    // ====================================================//
    // =======================================================//
    // =========================================================//
    // permutation//
    // //====================================================//
    // =======================================================//
    // =========================================================//
    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, up.substring(1));

        }

    }

    static ArrayList<String> permutationlist(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        // local to this call;
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutationlist(f + ch + s, up.substring(1)));

        }
        return list;

    }

    static int permutationint(String p, String up) {
        if (up.isEmpty()){
            return 1;
    }

    int c = 0;
    char ch = up.charAt(0);for(
    int i = 0;i<=p.length();i++)
    {
        String f = p.substring(0, i);
        String s = p.substring(i, p.length());
        c = c + permutationint(f + ch + s, up.substring(1));

    }return c;

}
}



