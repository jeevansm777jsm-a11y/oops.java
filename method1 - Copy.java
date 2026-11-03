public class method1 {
    public void display1(){
        System.out.println("method without parameter");
    }
    public void display2(int a){
        System.out.println("method with parameter: "+a);
    }
    public static void main(String[] args) {
        method1 obj=new method1();
        obj.display1();
        obj.display2(24);
    }
    
}