import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a line of integers:");
        String k=s.nextLine();
        StringTokenizer t=new StringTokenizer(k," ");
        int sum=0;
        ArrayList<String>A=new ArrayList<>();
        while(t.hasMoreTokens()){
            A.add(t.nextToken());
        }
        System.out.println("The integers are:");
        for(String c:A){
            System.out.println(c);
        }
        for(String c:A){
            sum+=Integer.parseInt(c);
        }
        System.out.println("The sum is: "+sum);
    }
}
