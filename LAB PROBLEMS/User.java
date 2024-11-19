import java.util.*;

class AgeRestrictionException extends Exception{

    public AgeRestrictionException(String a) {
        super(a);
    }
    
}

public class User{
    public static void main(String[] args)throws  AgeRestrictionException{
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Enter your age:");
            int a=s.nextInt();
            if(a<18){
                throw new AgeRestrictionException("Enther pillei veeti po");
            }
            else{
                System.out.println("You are allowed to vote!");
            }
        } catch (AgeRestrictionException e) {
            System.out.println("The exception has informed :"+e.getMessage());
        }
    }
}