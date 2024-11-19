import java.util.*;

class Get{
    int a;
    int b;

    Get(int a,int b){
        this.a=a;
        this.b=b;
    }

    void Add(){
        try{
            if(a<0 || b<0){
                throw new ArithmeticException("No negatives allowed");
            }
            else{
                System.out.println("The result is: "+(a+b));
            }
        }catch(ArithmeticException e){
            System.out.println("Exception occured"+e);
        }
    }

    void Subtract(){
        try{
            if(a<0 || b<0){
                throw new ArithmeticException("No negatives allowed");
            }
            else{
                System.out.println("The result is: "+(a-b));
            }
        }catch(ArithmeticException e){
            System.out.println("Exception occured"+e);
        }
    }

    void Multiply(){
        try{
            if(a==0 || b==0){
                throw new ArithmeticException("No zeroes allowed");
            }
            else{
                System.out.println("The result is: "+(a*b));
            }
        }catch(ArithmeticException e){
            System.out.println("Exception occured"+e);
        }
    }

    void Divide(){
        try{
            if(a==0 || b==0){
                throw new ArithmeticException("No zeroes allowed");
            }
            else{
                System.out.println("The result is: "+(a/b));
            }
        }catch(ArithmeticException e){
            System.out.println("Exception occured"+e);
        }
    }
}


public class Calculate{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try {
            System.out.println("Enter first number:");
            int a=s.nextInt();
            System.out.println("Enter second number:");
            int b=s.nextInt();
            while(true){
            System.out.println("MENU");
            System.out.println("1.Add\n2.Subtract\n3.Multply\n4.Divide");
            System.out.println("Enter your choice:");
            int c=s.nextInt();
            switch(c){
                case 1:
                    try{
                    Get g1=new Get(a, b);
                    g1.Add();
                    }catch(NullPointerException e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    Get g2=new Get(a, b);
                    g2.Subtract();;
                    break;
                case 3:
                    Get g3=new Get(a, b);
                    g3.Multiply();;
                    break;
                case 4:
                    Get g4=new Get(a, b);
                    g4.Divide();
                    break;
                default:
                    System.exit(0);
            }
        }
        } catch(InputMismatchException a){
            System.out.println("Only integers are allowed "+a);
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}