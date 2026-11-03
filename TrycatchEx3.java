import java.util.Scanner;

public class TrycatchEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            String age = sc.nextLine();

            int a = Integer.parseInt(age);
            System.out.println("Age: " + a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid age format!");
        }

        sc.close();
    }
}