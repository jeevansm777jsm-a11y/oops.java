public class DivisibiltyCheck {
    public static void main(String[] args) {
        int number = 221;

        if (number % 13 == 0) {
            System.out.println("221 is divisible by 13");
        } else if (number % 17 == 0) {
            System.out.println("221 is divisible by 17");
        } else {
            System.out.println("221 is not divisible by 13 or 17");
        }
    }
}


