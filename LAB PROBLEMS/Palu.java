import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class OddPaliandromeException extends Exception{
    public OddPaliandromeException(String s) {
        super(s);
    } 
}

class EvenPaliandromeException extends Exception{
    public EvenPaliandromeException(String s){
        super(s);
    }
}

class isPal{
    String s;
    public isPal(String s) {
        this.s=s;
    }
    public boolean check(){
    char A[]=new char[s.length()];
    A=s.toCharArray();
    for(int i=0;i<s.length();i++){
        if(A[i]!=A[(s.length())-i-1]){
            return false;
        }
    }
    return true;
    }
}

public class Palu{
    public static void main(String[] args)throws EvenPaliandromeException,OddPaliandromeException {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String name=s.nextLine();
        FileWriter f1=null;
        BufferedWriter b1=null;
        try {
            f1=new FileWriter("Pal.txt",true);
            b1=new BufferedWriter(f1);
            
            isPal i=new isPal(name);
            boolean n=i.check();
            if(n){
                b1.write(name);
                b1.newLine();
            }
            else{
                System.out.println("Not a paliandrome");
            }
            if((name.length()%2==0)){
                throw new EvenPaliandromeException("Aish even");
            }
            else{
                throw new OddPaliandromeException("Aish odd");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(EvenPaliandromeException e){
            System.out.println(e.getMessage());
        }
        catch(OddPaliandromeException e){
            System.out.println(e.getMessage());
        }
        finally{
            try {
                if(b1!=null){
                    b1.close();
                }
                if(f1!=null){
                    f1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}