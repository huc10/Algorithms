import java.util.Arrays;
import java.util.Scanner;

public class Mergesort {
    static int[] mergesort(int[] ar){
        int n=ar.length;
        if(n==1){
            return ar;
        }
        else{
            int[] left;
            int[] right;
            if(n%2==0){
                 left=new int[n/2];
                 right=new int[n/2];
            }
            else{
                left=new int[n/2];
                 right=new int[n/2+1];
            }
            for(int i=0;i<n;i++){
                if(i<n/2){
                    left[i]=ar[i];
                }
                else{
                    right[i-n/2]=ar[i];
                }
            }
            left=mergesort(left);
            right=mergesort(right);
            return merge(left,right);
        }
    }
    static int[] merge(int[] left,int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;
        int tot_l = left.length + right.length;
        int[] result = new int[tot_l];
        while (i < left.length && j < right.length) {
            if (left[i] > right[j]) {
                result[index] = right[j];
                j++;
            } else {
                result[index] = left[i];
                i++;
            }
            index++;
        }
        while(i<left.length){
            result[index]=left[i];
            i++;
            index++;
        }
        while(j<right.length){
            result[index]=right[j];
            j++;
            index++;
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a length of array to sort");
        int n=sc.nextInt();
        int[] lst=new int[n];
        System.out.print("Enter an array");
        for (int i=0;i<n;i++) {
            lst[i] = sc.nextInt();
        }
        lst=mergesort(lst);

        System.out.println(Arrays.toString(lst));


    }
}
