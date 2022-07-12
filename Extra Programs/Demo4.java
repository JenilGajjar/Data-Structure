// WAP to print Armstrong number from 1 to 1000.

public class Demo4 {

    public static boolean checkArmstrong(int n) {
        int temp = n;
        int digit = 0;
        while (n != 0) {
            n = n / 10;
            digit++;
        }
        n = temp;
        int count = 0;
        while (n != 0) {
            int i = n % 10;
            n = n / 10;
            count += Math.pow(i, digit);
        }
        if (count == temp) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (checkArmstrong(i))
                System.out.println(i);
        }
    }
}