import java.util.Scanner;

public class Palan {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string:");
        String word=s.nextLine();
        System.out.println("The word is: "+word);
        char[] AL=word.toCharArray();
        char[] RL=new char[word.length()];
        int i=0,m=0;
        for(int k=word.length()-1;k>=0;k--){
            RL[m++]=AL[k];
        }
        int flag=0;
        for(int j=0;j<word.length();j++){
            if(AL[j]!=RL[j]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("It is a paliandrome");
        }
        else{
            System.out.println("It is not a paliandrome");
        }
    }
}
