import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Read {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        FileReader f1=null;
        BufferedReader b1=null;
        try {
            f1=new FileReader("LAB PROBLEMS/Card.txt");
            b1=new BufferedReader(f1);
            ArrayList<String> A=new ArrayList<>();
            String k;
            while((k=b1.readLine())!=null){
                A.add(k);
            }
            for(String d:A){
                StringTokenizer t=new StringTokenizer(d," ");
                while(t.hasMoreTokens()){
                    if(t.nextToken().contains("Age:19")){
                        System.out.println(d);
                    }
                    
                }
            }
            b1.close();
            f1.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");;
        }catch(IOException m){
            System.out.println("ohno");;
        }
    }
}
