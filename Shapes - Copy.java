class Shapes {

    static void square(int side) {
        int area = side * side;
        int perimeter = 4 * side;

        System.out.println("Square");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    static void rectangle(int length, int breadth) {
        int area = length * breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("\nRectangle");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    static void circle(double radius) {
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println("\nCircle");
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public static void main(String[] args) {

        square(5);

        rectangle(10, 5);

        circle(7);
    }
}