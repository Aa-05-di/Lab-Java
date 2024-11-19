import java.util.Scanner;

class CardiException extends Exception{

    public CardiException(String s) {
        super(s);
    }
    
}

public class Mat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the first matrix:");
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

        System.out.println("Enter the size of the second matrix:");
        int r2=s.nextInt();
        int c2=s.nextInt();
        int B[][]=new int[r2][c2];
        System.out.println("Enter the elements:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j]=s.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(B[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("The multiplication part:");
        int P[][]=new int[r1][c2];
        try{
        if(c1!=r2){
            throw new CardiException("Cry vich");
        }
    }catch(CardiException c){
        System.out.println(c.getMessage());
    }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                P[i][j]=0;
                for(int k=0;k<c1;k++){
                    P[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        System.out.println("The product matrix is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(P[i][j]+"\t");
            }
            System.out.print("\n");
        }

    }
}
