public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 2 };
        int[] arr2 = { 1, 1, 2, 2, 2 };
        System.out.println(checkArray(arr));
        System.out.println(checkArray(arr2));
    }

    public static int checkArray(int[] a) {

        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return 0;
            } else if (a[i] == a[i + 1]) {
                count++;
            } else if (count < 2) {
                return 0;
            } else {
                count = 0;
            }
        }
        if (count <2) {
            return 0;
        }
        return 1;
    }
}
