package arrays;

import java.util.HashMap;

public class MF {

    /**
     * Most Frequently Occuring Item in an Array
     * most_frequent(given_array)
     * time complexity: O(n)
     * [1, 3, 1, 3, 2, 1] -> return 1
     */

    static Integer mostFrequent(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer num = null;
        int max = -1;

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                int value = map.get(arr[i]);
                map.put(arr[i], ++value);
            }

            if (max < map.get(arr[i])) {
                max = map.get(arr[i]);
                num = arr[i];
            }
        }


        return num;
    }

    public static void main(String[] args) {


        int[] array1 = {1, 3, 1, 3, 2, 1};
        System.out.println(mostFrequent(array1)); // 1
        int[] array2 = {3, 3, 1, 3, 2, 1};
        System.out.println(mostFrequent(array2)); // 3
        int[] array3 = {};
        System.out.println(mostFrequent(array3)); // null
        int[] array4 = {0};
        System.out.println(mostFrequent(array4)); // 0
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        System.out.println(mostFrequent(array5)); // -1

    }
}
