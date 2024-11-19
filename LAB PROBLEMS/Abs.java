import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


class Sort{
    void swap(String[] S,int i,int j){
        String temp=S[i];
        S[i]=S[j];
        S[j]=temp;
        
    }
    public void Quicksort(String[] A,int low,int high){
        if(low<high){
            int pi=partition(A,low,high);
            Quicksort(A, low, pi-1);
            Quicksort(A, pi+1, high);
        }
    }

    public int partition(String[] A,int low,int high){
        int i=low;
        int j=high;
        String pivot=A[low];
        while(i<j){
            while(i<high && (A[i].compareTo(pivot))<=0){
                i++;
            }
            while(j>low && (A[j].compareTo(pivot))>0){
                j--;
            }
            if(i<j){
                swap(A, i, j);
            }
        }
        swap(A, low, j);
        return j;
    }
}


public class Abs{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(args.length<1){
            System.out.println("Enter the file");
            return;
        }
        String output=args[0];
        FileWriter f1=null;
        BufferedWriter b1=null;
        try {
            f1=new FileWriter(output,true);
            b1=new BufferedWriter(f1);
            System.out.println("Enter the sentence:");
            String words=s.nextLine();
            StringTokenizer t=new StringTokenizer(words," ");
            StringTokenizer n=new StringTokenizer(words," ");
            int num=0;
            while(n.hasMoreTokens()){
                num++;
                n.nextToken();
            }
            String[] A=new String[num];
            int i=0;
            while(t.hasMoreTokens()){
                A[i++]=t.nextToken();
            }
            System.out.println("Before sorting is:");
            for(String k:A){
                System.out.print(k+"\t");
            }
            System.out.print("\n");

            Sort sort=new Sort();
            sort.Quicksort(A, 0, num-1);
            int p=0;
            while(p<(num)){
                b1.write(A[p++]);
                b1.newLine();
            }
            b1.close();
            f1.close();


            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}