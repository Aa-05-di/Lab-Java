import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Record {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        FileWriter f1=null;
        BufferedWriter b1=null;
        FileReader f2=null;
        BufferedReader b2=null;
        try {
            f1=new FileWriter("Card.txt",true);
            b1=new BufferedWriter(f1);
            System.out.println("Enter the name:");
            String name=s.nextLine();
            System.out.println("Enter the age:");
            int age=s.nextInt();
            System.out.println("Enter marks:");
            int marks=s.nextInt();
            b1.write("Name:"+name+"\tAge:"+age+"\tMarks:"+marks);
            b1.newLine();
            b1.close();
            f1.close();
            f2=new FileReader("card.txt");
            b2=new BufferedReader(f2);
            String k;
            while((k=(String)b2.readLine())!=null){
                System.out.println(k);
            }
            b2.close();
            f2.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException a){
            a.printStackTrace();
        }
    }
}
