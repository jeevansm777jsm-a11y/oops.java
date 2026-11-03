public class TrycatchExample1 {
    public static void main(String[] args){
        try{
            System.out.println(100 / 0);

        }
        catch(ArithmeticException e){
            System.out.println(e);

        }
        System.out.println("rest of the code");
    }
}
