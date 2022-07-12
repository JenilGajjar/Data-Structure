//  WAP to convert number of days into year, week & days [e.g. 375 days mean 1 year, 1 week and 3 days].
package SourceCode;

import java.util.Scanner;

public class Demo3 {

    public static void findSeries(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sum2 = 0;
            for (int j = 1; j <= i; j++) {
                sum2 += j;
            }
            sum += sum2;
        }
        System.out.println("sum of the first " + n + " terms is " + sum);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        findSeries(n);
        sc.close();
    }
}