package amazon;

import java.util.HashMap;
import java.util.Map;

public class Points {

    static HashMap<Integer, Double> getMax(HashMap<Integer, Double> hash) {
        HashMap<Integer, Double> max = new HashMap<>();

        for (Map.Entry<Integer, Double> h : hash.entrySet()) {
            if(max.isEmpty()) {
                max.put(h.getKey(), h.getValue());
            } else {
                Map.Entry<Integer, Double> maxH = max.entrySet().iterator().next();
                if (maxH.getValue() < h.getValue()) {
                    max.clear();
                    max.put(h.getKey(), h.getValue());
                }
            }
        }

        return max;
    }

    static HashMap<Integer, Double> getHash(int[][] points) {
        HashMap<Integer, Double> hash = new HashMap<>();
        int counter = 0;
        for (int[] point : points) {
            hash.put(counter++, Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2)));
        }

        return hash;
    }

    static int[][] kSmallestPoints(int[][] points, int k) {
        double[] distance = new double[points.length];
        int[][] kSmallestPoints_arr = {points[0], points[1]};

        for (int i = k; i < points.length; i++) {
            distance[i] = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            Map.Entry<Integer, Double> maxH = getMax(getHash(kSmallestPoints_arr)).entrySet().iterator().next();
            if (distance[i] < maxH.getValue()) {
                kSmallestPoints_arr[maxH.getKey()] = points[i];
            }
        }


        return kSmallestPoints_arr;
    }

    public static void main(String[] args) {

        int[][] arr = {{-2, 0}, {-1, 0}, {2, 5}, {-2, -3}, {3, 2}, {0, -2}, {0, -3}, {2, 2}, {0, 0} };
        int[][] points = kSmallestPoints(arr, 2);

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i][0] + " " +  points[i][1]);
        }
    }

}
