public class method2 {
    public void display1() {
        System.out.println("This has no peremeter");
    }
    public void display2(int a) {
        System.out.println("This has one peremeter " + a);
    }
    public static void main(String[] args) {
        method2 obj = new method2();
        obj.display1();
        obj.display2(5);
    }
}
