import java.util.Scanner;

public class HappyNumberDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number ");
        int n = sc.nextInt();
        int i = countDigit(n);
        if (i == 1) {
            System.out.println("Given Number Is Happy Number ");
        } else {
            System.out.println("Given Number Is Unappy Number ");
        }
        sc.close();
    }

    public static int countDigit(int n) {
        int sum = 0;
        while (n != 0) {
            int i = n % 10;
            n = n / 10;
            sum += i * i;
        }
        if (sum == 1) {
            return sum;
        } else if (sum == 4) {
            return 0;
        }
        return countDigit(sum);
    }

}