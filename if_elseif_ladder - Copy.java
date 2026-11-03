public class if_elseif_ladder {
    public static void main(String[] args) {
        int age = 25;
        if(age >3 && age < 13){
            System.out.println("You are a child.");
        } else if(age >= 13 && age < 19){
            System.out.println("You are a teenager.");
        } else if(age >= 19 && age < 40){
            System.out.println("You are an adult.");
        
        } 
        else if(age >= 40 && age < 60){
            System.out.println("You are a middle-aged adult.");
        }
        else if(age >= 60 && age < 80){
            System.out.println("You are a senior citizen.");
        }
        
        else {
            System.out.println("You are a baby");
        }

    }

}