import java.util.Scanner;


class Search{
    int A[];
    int key;
    int n;
    Search(int A[],int key,int n){
        this.A=A;
        this.key=key;
        this.n=n;
    }

    int Process(){
        int low=0;
        int high=n-1;
        while(true){
            int mid=(low+high)/2;
            if(A[mid]==key){
                return mid;
            }
            else if(A[mid]>key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
}


public class Binary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            A[i]=s.nextInt();
        }

        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+"\t");
        }
        System.out.println("\n");

        System.out.println("Enter the key to be searched for:");
        int key=s.nextInt();
        Search k=new Search(A, key, n);
        int m=k.Process();
        System.out.println("The item is in index: "+m);
    }
}
