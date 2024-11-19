import java.io.*;
import java.util.*;

public class Files1{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        FileWriter f1=null;
        BufferedWriter b1=null;
        FileReader f2=null;
        BufferedReader b2=null;
        try {
            f1=new FileWriter("Mahesh.txt");
            b1=new BufferedWriter(f1);
            System.out.println("Enter your line here:");
            String name=s.nextLine();
            b1.write(name+"\n");
            b1.close();
            f1.close();
            
            f2=new FileReader("Mahesh.txt");
            b2=new BufferedReader(f2);
            String k=(String)b2.readLine();
            System.out.println(k);
            StringTokenizer t=new StringTokenizer(k," .!,");
            int c1=0;
            while(t.hasMoreTokens()){
                c1++;
                t.nextToken();
            }
            System.out.println("The number of words is: "+c1);

            int charCount = 0;
            for (char ch : k.toCharArray()) {
                if (ch != ' ') {
                    charCount++;
                }
            }
            System.out.println("The number of characters excluding spaces is: " + charCount);
            
            StringTokenizer t2=new StringTokenizer(k,".,!");
            int c2=0;
            while(t2.hasMoreTokens()){
                c2++;
                t2.nextToken();
            }
            System.out.println("The number of sentences is: "+c2);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException a){
            a.printStackTrace();
        }
        finally{
            try {
                if(b2!=null){
                    b2.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(f2!=null){
                    f2.close();
                }
            } catch (IOException b) {
                b.printStackTrace();
            }
        }
    }
}