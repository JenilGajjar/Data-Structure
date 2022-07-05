// check whether the given arrray conatins the given element or not

import java.util.*;

class Element_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value arr[" + i + "]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to check");
        int i = sc.nextInt();

        // System.out.print(check(arr, i));

        if (check(arr, i)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
        sc.close();
    }

    public static boolean check(int arr[], int n) {
        boolean flag = false;
        if (arr[0] == n) {
            flag = true;
            return flag;
        } else if (arr.length != 1) {
            int[] b = new int[arr.length - 1];
            for (int j = 0; j < b.length; j++) {
                b[j] = arr[j + 1];

            }
            flag = check(b, n);
        } else {
            return flag;
        }
        return flag;
    }
}
