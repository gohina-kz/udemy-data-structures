package arrays;

public class IR {

    /**
     * Is one array a rotation of another?
     * A = [1, 2, 3, 4, 5, 6, 7]
     * B = [4, 5, 6, 7, 1, 2, 3]
     * *no duplicates
     * return true
     * O(n)
     */



    static boolean isRotation(int[] A, int[] B) {

        if (A.length == B.length) {
            int index = 0;

            while (index < B.length && A[0] != B[index]) {
                index++;
            }

            if (index == B.length) {
                return false;
            }

            for (int i = 0; i < B.length; i++) {
                if (A[i] < B[(index + i) % B.length]) {
                    return  false;
                }
            }

            return true;
        }



        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        System.out.println(isRotation(array1, array2a)); // false
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(isRotation(array1, array2b));// true
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        System.out.println(isRotation(array1, array2c)); // false
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        System.out.println(isRotation(array1, array2d)); // false
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        System.out.println(isRotation(array1, array2e)); // false
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(isRotation(array1, array2f)); // true
    }

}
