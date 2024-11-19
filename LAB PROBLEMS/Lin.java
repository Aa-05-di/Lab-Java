import java.util.Scanner;

public class Lin {
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

        System.out.println("\nEnter the element that you want to search for:");
        int key=s.nextInt();

        int flag=0;
        int i=0;
        for(i=0;i<n;i++){
            if(A[i]==key){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+i);
        }
    }
}
