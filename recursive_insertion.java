
import java.util.Arrays;
import java.util.Scanner;

public class recursive_insertion {

    static void rec_insertion(int[] A,int n){

        rec_insertion(A,n-1);

        int key=A[n];
        int i=n-1;
        while(i>0 && key>A[i]){
             A[i+1]=A[i];
             i=i-1;
        }
        A[i]=key;

}
    static void print_array(int[] ar){
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int []lst=new int[l];
        for(int k=0;k<l;k++){
            lst[k]=sc.nextInt();
        }
        rec_insertion(lst,l);
        print_array(lst);


    }

}