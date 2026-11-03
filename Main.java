public class method {
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        method obj = new method();
        int result = obj.add(a, b);

        System.out.println("Sum of a and b is: " + result);
    }
}
