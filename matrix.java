public class matrix {
    public static void main(String[] args) {
        int a[][] = { { 2, 3, 4 }, { 2, 6, 4 }};
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(a[i][j]);

            }
            System.out.println();
        }

    }
}
