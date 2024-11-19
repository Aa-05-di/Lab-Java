import java.util.Scanner;

public class Identity {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int r1=s.nextInt();
        int c1=s.nextInt();
        int A[][]=new int[r1][c1];
        System.out.println("Enter the elements:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j]=s.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.print("\n");
        }

        int flag=0;
        int f1=0;

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                if(A[i][j]==1 || A[i][j]==0){
                    if(i==j){
                        if(A[i][j]!=1){
                            flag=1;
                        }
                    }
                    if(flag==0){
                        if(A[i][j]==0){
                            flag=2;
                        }
                    }
                }
                else{
                    f1=1;
                }
            }
        }
        if(flag==2 && f1!=1){
            System.out.println("It is an identity matrix");
        }
        else{
            System.out.println("Not an identity matrix");
        }
    }
}
