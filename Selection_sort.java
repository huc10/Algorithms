import java.util.Arrays;
import java.util.Scanner;

public class Selection_sort {
    static void selection(int[] lst){
        int n=lst.length;
        for (int i=0;i<n;i++){
            int small=i;
            for(int j=i+1;j<n;j++){
                if(lst[small]>lst[j])  small=j;
            }
            int temp=lst[i];
            lst[i]=lst[small];
            lst[small]=temp;
        }
    }
    static void print(int[] lst){
        System.out.println(Arrays.toString(lst));
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();
    int[]ar = new int[l];
    for(int i=0;i<l;i++){
        ar[i]=sc.nextInt();
    }
    selection(ar);
    print(ar);
}

}

