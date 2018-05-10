package twodimensionalarrays;

public class R2 {

    static int[][] rotate(int[][] field, int n) {

        int[][] new_field = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                new_field[j][n - 1 - i] = field[i][j];
            }
        }

        return new_field;
    }

    public static void main(String[] args) {
        int a1[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] field_1 = rotate(a1, 3);

        for (int[] row : field_1) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
        // [[7, 4, 1],
        //  [8, 5, 2],
        //  [9, 6, 3]]

        int a2[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int[][] field_2 = rotate(a2, 4);

        for (int[] row : field_2) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
        // [[13, 9, 5, 1],
        //  [14, 10, 6, 2],
        //  [15, 11, 7, 3],
        //  [16, 12, 8, 4]]
    }

}
