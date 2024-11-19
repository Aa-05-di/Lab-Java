import java.util.Scanner;

class Sort{
    private void swap(String S[],int p,int q){
        String temp=S[p];
        S[p]=S[q];
        S[q]=temp;
    }

    public void Quicksort(String S[],int low,int high){
        if(low<high){
            int pi=partition(S,low,high);
            Quicksort(S, low,pi-1);
            Quicksort(S, pi+1, high);
        }
    }

    public int partition(String S[],int low,int high){
        String pivot=S[low];
        int i=low;
        int j=high;
        while(i<j){
            while(i<high && S[i].compareTo(pivot)<=0){
                i++;
            }
            while(j>low && S[j].compareTo(pivot)>0){
                j--;
            }
            if(i<j){
                swap(S, i, j);
            }
        }
        swap(S, j, low);
        return j;

    }
}



public class Quick {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array of Strings");
        int n=s.nextInt();
        String S[]=new String[n];
        System.out.println("Enter the items:");
        for(int i=0;i<n;i++){
            S[i]=s.next();
        }
        System.out.println("The strings are:");
        for(int i=0;i<n;i++){
            System.out.print(S[i]+"\t");
        }
        System.out.println("\n");

        Sort q=new Sort();
        q.Quicksort(S, 0, n-1);

        System.out.println("The array after sorting is:");
        for(int i=0;i<n;i++){
            System.out.print(S[i]+"\t");
        }

    }
}
