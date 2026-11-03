public class condition3 {
    public static void main(String[] args) {
        int n = 21;

        System.out.println("Sequence from 21:");

        while (n != 1) {
            System.out.print(n + " ");

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.println(n);
    }
}
