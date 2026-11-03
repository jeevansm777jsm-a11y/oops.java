import java.util.Scanner;

public class AgeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String age = sc.nextLine();

        try {
            int a = Integer.parseInt(age);
            System.out.println("Your age is: " + a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }

        sc.close();
    }
}


