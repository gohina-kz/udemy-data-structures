package arrays;

import java.util.LinkedList;

public class CE {

    /**
     * Common elements in two sorted arrays
     * A = [1, 3, 4, 6, 7, 9]
     * B = [1, 2, 4, 5, 9, 10]
     * return => [1, 4, 9]
     * O(max(n, m))
     */

    static Integer[] commonElements(int[] A, int[] B) {
        int p1 = 0;
        int p2 = 0;
        LinkedList<Integer> list = new LinkedList<>();

        while (p1 < A.length && p2 < B.length) {
            if (A[p1] == B[p2]) {
                list.add(A[p1]);
                p1++;
                p2++;
            } else if (A[p1] > B[p2]) {
                p2++;
            } else {
                p1++;
            }
        }


        return list.toArray(new Integer[list.size()]);
    }



    public static void main(String[] args) {
        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
       // [1, 4, 9]
        Integer[] res = commonElements(array1A, array2A);

        for (Integer i : res) {
            System.out.print(i + " ");
        }

        System.out.println();

        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // [1, 2, 9, 10, 12]
        Integer[] res2 = commonElements(array1B, array2B);

        for (Integer i : res2) {
            System.out.print(i + " ");
        }

        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        // []
        Integer[] res3 = commonElements(array1C, array2C);

        for (Integer i : res3) {
            System.out.println(i);
        }
    }

}
