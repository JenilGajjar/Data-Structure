
// public Implement a program for stack that performs following operations using array: PUSH, POP, PEEP, CHANGE & DISPLAY 

import java.util.Scanner;

public class StackDemo1 {

    int n;
    int[] arr = new int[10];
    int top = -1;

    public void setSize(int i) {
        n = i;
    }

    public void push(int x) {
        if (top >= arr.length) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public void display() {
        for (int j = 0; j <= top; j++) {
            System.out.print("[" + arr[j] + "]" + " ");
        }
        System.out.println();
    }

    public int pop() {
        if (top <= -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            top--;
            return arr[top + 1];
        }
    }

    public int peep(int i) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack underflow");
            return 0;
        } else {
            return arr[top - i + 1];
        }
    }

    public void change(int i, int x) {
        if (top - i + 1 <= -1) {
            System.out.println("Stack underflow");
        } else {
            arr[top - i + 1] = x;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array ");
        int a = sc.nextInt();
        StackDemo1 stack = new StackDemo1();
        stack.setSize(a);
        System.out.println(stack.arr.length);
        while (true) {
            System.out.println("Enter your choice ");
            System.out.println("Press 1 for push");
            System.out.println("Press 2 for pop");
            System.out.println("Press 3 for peep");
            System.out.println("Press 4 for change");
            System.out.println("Press 5 for display");
            System.out.println("Press 6 for exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter n ");
                stack.push(sc.nextInt());
            } else if (ch == 2) {
                int temp = stack.pop();
                System.out.println(temp);
            } else if (ch == 3) {
                System.out.print("Enter i ");
                int temp = stack.peep(sc.nextInt());
                System.out.println(temp);
            } else if (ch == 4) {
                System.out.print("Enter i ");
                int i = sc.nextInt();
                System.out.print("Enter n ");
                int n = sc.nextInt();
                stack.change(i, n);
            } else if (ch == 5) {
                stack.display();
            } else {
                break;
            }
        }
        sc.close();
    }
}