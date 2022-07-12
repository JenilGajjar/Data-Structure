//  WAP to convert number of days into year, week & days [e.g. 375 days mean 1 year, 1 week and 3 days].

package SourceCode;

import java.util.Scanner;

public class Demo2 {

    public static void convert(int days) {

        int year = days / 365;
        days = days % 365;
        int week = days / 7;
        days = days % 7;
        System.out.println(year + " year," + week + " week and " + days + " days ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days ");
        int n = sc.nextInt();
        convert(n);
        sc.close();
    }
}