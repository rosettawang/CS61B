public class HW0Solutions {
    public static int max(int[] a) {
        int highestsofar = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > highestsofar) {
                highestsofar = a[i];
            }
        }
        return highestsofar;
    }

    public static boolean threeSum(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean threeSumDistinct(int[] a) {
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
