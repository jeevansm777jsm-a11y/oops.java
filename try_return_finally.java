public class try_return_finally {
    static void myMethod(){
        try{
            System.out.println("Inside try block");
            return;
        }finally{
            System.out.println("i am in finally block");
        }
    }
    public static void main(String[] args){
        myMethod();
    }

}
