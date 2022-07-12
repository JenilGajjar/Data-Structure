package SourceCode;

import java.util.Scanner;

// WAP to convert seconds into hours, minutes & seconds and print in HH:MM:SS [e.g. 10000 seconds 
// mean 2:46:40 (2 Hours, 46 Minutes, 40 Seconds)].

public class Demo1 {
    public static void convert1(int seconds) {
        int hours = seconds / 3600;
        seconds = seconds % 3600;
        int minutes = seconds / 60;
        seconds = seconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void convert2(int seconds) {
        int minutes = 0;
        int hours = 0;
        while (seconds >= 60) {
            seconds -= 60;
            minutes++;
            while (minutes >= 60) {
                hours++;
                minutes -= 60;
            }
        }
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Seconds ");
        int seconds = sc.nextInt();
        convert1(seconds);
        convert2(seconds);
        sc.close();
    }
}