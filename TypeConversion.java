public class TypeConversion {
    public static void main(String[] args) {

        
        int i = 75;
        float f = i;  
        System.out.println("int value   : " + i);
        System.out.println("int to float: " + f);

        
        float f2 = 130.99f;
        byte b = (byte) f2; 
        System.out.println("\nfloat value    : " + f2);
        System.out.println("float to byte  : " + b);
    }
}
