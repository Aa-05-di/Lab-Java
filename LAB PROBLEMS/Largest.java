import java.util.Scanner;

public class Largest {
    int max=0;

    void Check(int a){
        if(a>max){
            max=a;
        }
    }

    void Large(){
        System.out.println("\nThe largest element is: "+max);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int A[]=new int[10];
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }

        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+"\t");
        }

        Largest m=new Largest();

        for(int i=0;i<n;i++){
            m.Check(A[i]);
        }

        m.Large();
    }
}
