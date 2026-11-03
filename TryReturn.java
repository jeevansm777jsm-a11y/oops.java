
public class TryReturn {
    static void display() {
        try {
            System.out.println("Inside try block");
            return;
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void main(String[] args) {
        display();
        System.out.println("Main method executed");
    }
}

