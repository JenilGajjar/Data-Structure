
/*
 Write a program to swap two numbers using user-defines method
 */

public class SwapNumber {
    int x, y;

    public void swapNumber() {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {
        SwapNumber obj1 = new SwapNumber();
        obj1.x = 1;
        obj1.y = 2;
        System.out.println("Before swap");
        System.out.println(" Value of x: " + obj1.x + " value of y : " + obj1.y);
        obj1.swapNumber();
        System.out.println("after swap");
        System.out.println(" Value of x: " + obj1.x + " value of y : " + obj1.y);
    }
}