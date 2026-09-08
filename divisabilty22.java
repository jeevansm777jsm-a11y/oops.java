 public class Divisibility22 {
    public static void main(String[] args) {
        int n = 22;
        System.out.println("Number: " + n);
        if (n % 13 == 0) {
            if (n % 17 == 0) {
                System.out.println(n + " is divisible by both 13 and 17.");
            } else {
                System.out.println(n + " is divisible by 13 but not by 17.");
            }
        } else {
            if (n % 17 == 0) {
                System.out.println(n + " is divisible by 17 but not by 13.");
            } else {
                System.out.println(n + " is not divisible by 13 or 17.");
            }
        }
    }
}
