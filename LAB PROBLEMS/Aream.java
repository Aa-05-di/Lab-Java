import java.util.Scanner;

class Calc{
    public void area(int a){
        int area1=a*a;
        System.out.println("The area is: "+area1);
    }

    public void area(int a,int b){
        double area2=0.5*a*b;
        System.out.println("The area is: "+area2);
    }

    public void area(double a,double b){
        double area3=a*b;
        System.out.println("The area is: "+area3);
    }
}



public class Aream{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Calc m=new Calc();
        while(true){
        System.out.println("MENU");
        System.out.println("1.Area of Square\n2.Area of Triangle\n3.Area of Rectangle\n");
        System.out.println("Enter your choice:");
        int c=s.nextInt();
        
        switch(c){
            case 1:
                System.out.println("Enter the size:");
                int a=s.nextInt();
                m.area(a);
                break;
            case 2:
                System.out.println("Enter height:");
                int e=s.nextInt();
                System.out.println("Enter base:");
                int f=s.nextInt();
                m.area(e,f);
                break;
            case 3:
                System.out.println("Enter length:");
                double p=s.nextDouble();
                System.out.println("Enter breadth:");
                double q=s.nextDouble();
                m.area(p,q);
                break;
            default:
                System.exit(0);

        }
    }
    }
}
