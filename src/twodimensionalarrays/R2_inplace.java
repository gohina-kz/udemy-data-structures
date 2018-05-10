package twodimensionalarrays;

public class R2_inplace {
    static int[][] rotate(int[][] field, int n) {
        for (int i = 0; i < n / 2 + n % 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int[] temp = {-1, -1, -1, -1};
                int cur_i = i;
                int cur_j = j;

                for (int k = 0; k < 4; k++) {
                    temp[k] = field[cur_i][cur_j];
                    int temp_i = cur_i;
                    cur_i = cur_j;
                    cur_j = n - 1 - temp_i;
                }

                for (int k = 0; k < 4; k++) {
                    field[cur_i][cur_j] = temp[(k + 3) % 4];
                    int temp_i = cur_i;
                    cur_i = cur_j;
                    cur_j = n - 1 - temp_i;
                }
            }
        }
        return field;
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
