import java.math.BigInteger;

// Read two number of 255 digit and sum them and store into 3rd one and print it  

public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger a = new BigInteger(args[0]);
        BigInteger b = new BigInteger(args[1]);
        BigInteger sum = a.add(b);

        System.out.println("Addition of two BigIntegers is:  " + sum);
    }
}