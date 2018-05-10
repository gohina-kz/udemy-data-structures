package strings;

import java.util.HashMap;
import java.util.Map;

public class NR {

    /**
     * Non-repeating character
     * non_repeating('aabcb') => c
     * non_repeating('xxyz') => y
     * non_repeating('aabb') => null
     * O(n)
     */
    static Character nonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character l : str.toCharArray()) {
            if (!map.containsKey(l)) {
                map.put(l, 1);
            } else {
                Integer count = map.get(l);
                map.put(l, ++count);
            }
        }

        for (Character l : str.toCharArray()) {
            if (map.get(l) == 1) {
                return l;
            }
        }


        return null;
    }

    public static void main(String[] args) {
        System.out.println(nonRepeating("abcab")); // should return 'c'
        System.out.println(nonRepeating("abab")); // should return null
        System.out.println(nonRepeating("aabbbc")); // should return 'c'
        System.out.println(nonRepeating("aabbdbc")); // should return 'd'
    }
}
