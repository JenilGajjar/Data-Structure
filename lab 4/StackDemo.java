
// Implement a program for stack that performs following operations using array: PUSH, POP, PEEP, 
// CHANGE & DISPLAY

public class StackDemo {

    static int top;

    public static void push(int[] arr, int top, int x) {
        if (top >= arr.length)
            System.out.println("Stack Overflow");
        else {
            top++;
            StackDemo.top++;
            arr[top - 1] = x;
        }

    }

    public static void pop(int[] arr, int top) {

        if (top <= 0)
            System.out.println("Stack Underflow");
        else {
            top--;
            StackDemo.top--;
            arr[top] = 0;
        }
    }

    public static int peep(int[] arr, int top, int i) {

        if (top - i + 1 <= 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else
            return arr[top - i];
    }

    public static void change(int[] arr, int top, int i, int x) {

        if (top - i + 1 <= 0)
            System.out.println("Stack Underflow");
        else
            arr[top - i] = x;
    }

    public static void display(int[] a, int i) {

        if (i > a.length || i <= 0)
            System.out.println("Elemnt does not exist ");
        else
            System.out.println("Element " + i + " of the stak is " + a[i - 1]);
    }

    public static void main(String[] args) {

        int[] a = new int[4];

        push(a, top, 1);
        push(a, top, 2);
        push(a, top, 3);
        push(a, top, 4);

        // for (int i = 0; i < a.length; i++) {
        // System.out.println(a[i]);
        // }

        pop(a, top);

        // for (int i = 1; i <= a.length; i++) {
        // System.out.println("Element " + i + " From top of the stack");
        // System.out.println(peep(a, top, i));
        // }

        System.out.println(peep(a, top, 1));

        change(a, top, 1, 10);

        display(a, 2);
    }
}
