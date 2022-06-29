import java.util.Arrays;

public class PairsInArray {
    public static void main(String[] args) {
        int[] a = { 0, 0, 0, 0, 1, 1, 2, 2, 6, 4, 3, 3 };
        System.out.println(countPairs(a));
    }

    public static int countPairs(int[] a) {
        int count = 0;
        Arrays.sort(a);
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
                a[i] = a[i + 1] = min - 1;
            }
        }
        return count;
    }
}
