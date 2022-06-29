public class SecondMaxInArray {
    public static void main(String[] args) {
        int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int max = 0, max2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max2 = max;
                max = a[i];
            }
        }
        System.out.println(max2);
    }
}
