import java.util.Arrays;

public class HappyNumberDemo1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        happyNumber(n);
        sc.close();
    }

    public static int countDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int i = n % 10;
            n = n / 10;
            sum += i * i;
        }
        return sum;
    }

    public static void happyNumber(int n) {
        int[] arr = new int[100];
        arr[0] = countDigit(n);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 1) {
                break;
            } else {
                arr[i] = countDigit(arr[i - 1]);
            }
        }
        Arrays.sort(arr);
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && arr[i] != 0) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Given Number is not happy");
        } else {
            System.out.println("Given Number is happy");
        }

    }
}
