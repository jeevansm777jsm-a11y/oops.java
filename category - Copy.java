public class category {
    public static void main(String[] args) {
    int age=45;

    if (age<=13)
        System.out.println("child");
    else if(age<=18)
        System.out.println("Teen");
    else if(age<=40)
        System.out.println("Major");
    else if(age<=60)
        System.out.println("Matured");
    else if(age>60)
        System.out.println("Senior citizen");
    else
        System.out.println("Baby");
}
}
