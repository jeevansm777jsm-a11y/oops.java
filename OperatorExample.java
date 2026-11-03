public class OperatorExample{
    public static void main (String args[]){
        int a = 10;
        int b = 5;
        System.out.println("Addition:" + (a+b));
        System.out.println("Subtraction:" + (a-b));
        System.out.println("Multiplication:" + (a*b));
        System.out.println("Division:" + (a/b));
        System.out.println("Modulo:" + (a%b));
        
        // Left Shift (<<): Shifts bits to the left, fills with 0 (a * 2^2)
        System.out.println("Left Shift (10 << 2): " + (10 << 2));   // 10 * 4 = 40
        System.out.println("Left Shift (10 << 3): " + (10 << 3));   // 10 * 8 = 80

        // Right Shift (>>): Shifts bits to the right, preserves sign bit (a / 2^1)
        System.out.println("Right Shift (10 >> 1): " + (10 >> 1));  // 10 / 2 = 5
        System.out.println("Right Shift (20 >> 2): " + (20 >> 2));  // 20 / 4 = 5

        // Unsigned Right Shift (>>>): Shifts bits to the right, fills high-order bits with 0
        System.out.println("Unsigned Right Shift (20 >>> 2): " + (20 >>> 2)); // 5
        System.out.println("Unsigned Right Shift (-10 >>> 2): " + (-10 >>> 2)); // High 0s filled

        // Ternary Operator (condition ? value_if_true : value_if_false)
        int min = (a < b) ? a : b;
        System.out.println("\nTernary Operator (Min of a and b): " + min);

        String isEven = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("Ternary Operator (Check if a is Even/Odd): " + isEven);

        int maxOfThree = (a > b) ? ((a > 20) ? a : 20) : b;
        System.out.println("Nested Ternary Operator Result: " + maxOfThree);
    }
}