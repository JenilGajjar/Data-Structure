// Read n numbers in an array then read two different numbers, replace 1st number with 2nd number 
// in an array and print its index and final array
import java.util.*;

public class ArrayReplce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        System.out.println("Enter the element you want to compare ");
        int a = sc.nextInt();
        System.out.println("Enter the element you want to replace with ");
        int b = sc.nextInt();

        // Creating an array
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == a) {
                array[i] = b;
                System.out.println("Number " + a + " is found at index " + i);
            }
        }
        System.out.println("New Array ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}

// while()