public class TryCatchEx2{
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4, 5};
        try{
            for(int i = 0; i <= 7; i++){
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds!");
        }
    }
}