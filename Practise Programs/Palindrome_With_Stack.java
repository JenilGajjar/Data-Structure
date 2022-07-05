import java.util.*;

public class Palindrome_With_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string ");

        String str = sc.next();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);
        }

        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            str2 += stack.pop();
        }

        if (str.equals(str2))
            System.err.println("Given string is palindrome ");
        else
            System.err.println("Given string is not palindrome ");

        sc.close();
    }
}
