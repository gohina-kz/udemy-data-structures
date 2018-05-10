package twodimensionalarrays;

import java.util.ArrayDeque;

public class MS2 {

     static int[][] click(int[][] field, int num_rows, int num_cols, int i, int j) {

        if (field[i][j] == 0) {

            ArrayDeque<int[]> queue = new ArrayDeque<>();
            field[i][j] = -2;
            int[] points = {i, j};
            queue.push(points);

            while (!queue.isEmpty()) {
                points = queue.remove();

                for (int a = points[0] - 1; a <= points[0] + 1; a++) {
                    for (int b = points[1] - 1; b <= points[1] + 1; b++) {
                        if (a >= 0 && a < num_rows && b >= 0 && b < num_cols && field[a][b] == 0) {
                            field[a][b] = -2;
                            int[] pointsToCheck = {a, b};
                            queue.push(pointsToCheck);
                        }
                    }
                }
            }



        }

        return field;
    }

    public static void main(String[] args) {
        int[][] field1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, -1, 1, 0}};

        int[][] field1_1 = click(field1, 3, 5, 2, 2);
        // [[0, 0, 0, 0, 0],
        //  [0, 1, 1, 1, 0],
        //  [0, 1, -1, 1, 0]]
        for (int[] row : field1_1) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }

        int[][] field1_2 = click(field1, 3, 5, 1, 4);
        // [[-2, -2, -2, -2, -2],
        //  [-2, 1, 1, 1, -2],
        //  [-2, 1, -1, 1, -2]]
        for (int[] row : field1_2) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }

        int[][] field2 = {{-1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1},
                {0, 0, 1, -1}};

        int[][] field2_1 = click(field2, 4, 4, 0, 1);
        // [[-1, 1, 0, 0],
        //  [1, 1, 0, 0],
        //  [0, 0, 1, 1],
        //  [0, 0, 1, -1]]
        for (int[] row : field2_1) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
        int[][] field2_2 = click(field2, 4, 4, 1, 3);
        // [[-1, 1, -2, -2],
        //  [1, 1, -2, -2],
        //  [-2, -2, 1, 1],
        //  [-2, -2, 1, -1]]
        for (int[] row : field2_2) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
    }

}
