import java.util.*;

public class Occur{
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

        boolean visited[]=new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(A[i]==A[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println("\nThe item "+A[i]+ " has occuered "+count+" times");
        }


    }
}
