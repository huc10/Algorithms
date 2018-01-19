import java.util.Arrays;
import java.util.Scanner;

public class insertion_sort {
    static void insertion(int[] ar){
        int n=ar.length;
        for(int i=1;i<n;i++){
            int key=ar[i];
            int j=i-1;
            while(j>=0 && key<ar[j]){
                ar[j+1]=ar[j];
            j--;
            }
            ar[j+1]=key;
        }
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
        insertion(lst);
        print_array(lst);


    }

}
