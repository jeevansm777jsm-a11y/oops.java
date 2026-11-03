public class TrycatchExample{
public static void main(String[] args){
    try{
        int arr[] = {1,3,5,7};
        System.out.println(arr[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println(e);
    }
    System.out.println("rest of the code");

}
}