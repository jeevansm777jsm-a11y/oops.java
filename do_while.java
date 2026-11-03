public class do_while {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        int sum = 0;

        do {
            sum += number;
            number += 2;
            count++;
        } while (count < 10);

        System.out.println("Sum of first 10 even numbers = " + sum);
    }
}