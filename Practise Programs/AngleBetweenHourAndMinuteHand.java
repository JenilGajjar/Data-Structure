public class AngleBetweenHourAndMinuteHand {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter Hour Hand");

        int hour = sc.nextInt();
        System.out.println("Enter Minute Hand");
        int minute = sc.nextInt();

        System.out.println(angle(hour, minute));
        sc.close();
    }

    public static double angle(int h, int m) {
        double angle1 = ((h * 60 + m) * (0.5));
        double angle2 = m * 6;
        double a = angle1 - angle2;
        return Math.abs(Math.min(a, 360 - a));
    }
}
