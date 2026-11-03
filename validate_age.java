class Main {
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                "Access denied: Under 18"
            );
        }
        System.out.println("Access granted");
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}