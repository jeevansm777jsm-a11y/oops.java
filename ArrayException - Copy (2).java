public class ArrayException {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        try {
            for (int i = 0; i <= 7; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds!");
        }
    }
}

