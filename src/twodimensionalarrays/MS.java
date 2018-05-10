package twodimensionalarrays;

public class MS {

    static int[][] mineSweeper(int[][] bombs, int rowNum, int colNum) {
        int[][] field = new int[rowNum][colNum];

        for (int[] bomb : bombs) {
            int row = bomb[0];
            int col = bomb[1];

            field[row][col] = -1;

            for (int i = row - 1; i <= row + 1; i++) {
                for (int j = col - 1; j <= col + 1; j++) {
                    if (i >= 0 && i < rowNum && j >= 0 && j < colNum) {
                        if (field[i][j] != -1) {
                            field[i][j] += 1;
                        }
                    }
                }
            }
        }

        return field;
    }

    public static void main(String[] args) {
        int[][] bombs1 = {{0, 2}, {2, 0}};
        int[][] field1 = mineSweeper(bombs1, 3, 3);

        for (int[] row : field1) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }

        // [[0, 1, -1],
        //  [1, 2, 1],
        //  [-1, 1, 0]]

        int[][] bombs2 = {{0, 0}, {0, 1}, {1, 2}};
        int[][] field2 = mineSweeper(bombs2, 3, 4);

        for (int[] row : field2) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
        // [[-1, -1, 2, 1],
        //  [2, 3, -1, 1],
        //  [0, 1, 1, 1]]

        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        int[][] field3 = mineSweeper(bombs3, 5, 5);
        for (int[] row : field3) {
            System.out.println();
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
        // [[1, 2, 2, 1, 0],
        //  [1, -1, -1, 2, 0],
        //  [1, 3, -1, 2, 0],
        //  [0, 1, 2, 2, 1],
        //  [0, 0, 1, -1, 1]]
    }

}
