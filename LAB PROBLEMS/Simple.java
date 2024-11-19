import java.util.InputMismatchException;
import java.util.Scanner;

public class Simple{
    public static void main(String[] args) {
        int result;
        Scanner s=new Scanner(System.in);
        try{
        System.out.println("Enter first number:");
        int a=s.nextInt();
        System.out.println("Enter second number:");
        int b=s.nextInt();
        while(true){
        System.out.println("MENU");
        System.out.println("1.Add\n2.Subtract\n3.Divide\n4.Multiply\n");
        System.out.println("Enter your choice:");
        int c=s.nextInt();
        switch(c){
            case 1:
                result=a+b;
                System.out.println("The result is: "+result);
                break;
            case 2:
                result=a-b;
                System.out.println("The result is: "+result);
                break;
            case 3:
                if(b==0){
                    throw new ArithmeticException();
                }
                result=a/b;
                System.out.println("The result is: "+result);
                break;
            case 4:
                result=a*b;
                System.out.println("The result is: "+result);
                break;
            default:
                System.exit(0);

        }
    }
}catch(ArithmeticException e){
    System.out.println("Division by zero not possible");
}catch(InputMismatchException e){
    System.out.println("Not an integer");
}


    }
}