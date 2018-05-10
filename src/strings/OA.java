package strings;

public class OA {

    static boolean oneWay(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return oneWaySameLength(str1, str2);
        } else if (str1.length() - str2.length() == 1) {
            return oneWayDifLength(str1, str2);
        } else if (str1.length() - str2.length() == -1) {
            return oneWayDifLength(str2, str1);
        }

        return false;
    }

    static boolean oneWaySameLength(String str1, String str2) {

        int counter = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                counter++;
            }

            if (counter > 1) {
                return false;
            }

        }
        return true;
    }

    static boolean oneWayDifLength(String str1, String str2) {
        int p1 = 0;
        int p2 = 0;

        while (p1 < str1.length() && p2 < str2.length()) {
            if (str1.charAt(p1) != str2.charAt(p2)) {
                p1++;
            }
        }



        return true;
    }



    public static void main(String[] args) {

    }
}
