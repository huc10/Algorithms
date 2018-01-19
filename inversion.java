import java.util.Arrays;
import java.util.Scanner;
public class inversion {

    static int merge(int[] A){
      int[] left,right;
      int inversi;
      int n=A.length;
      if(n==1) return 0;
      if(n%2==0){
          left=new int[n/2];
          right=new int[n/2];
      }
      else{
          left=new int[n/2];
          right=new int[n/2 +1];
      }
      for(int i=0;i<n;i++){
          if(i<n/2){
              left[i]=A[i];
          }
          else{
              right[i-n/2]=A[i];
          }
      }
      inversi=merge(left);
      inversi=inversi+merge(right);
      inversi= inversi+mergesort(A,left,right);
      return inversi;
  }
   static int mergesort(int[] A, int[] left,int[] right){

        int i=0;
        int j=0;
        int k=0;
        int inversions=0;
       while(i<left.length && j<right.length){
           if(left[i]>right[j]){
               A[k]=right[j];
               j++;
               inversions=inversions+left.length-i;
           }
           else{
               A[k]=left[i];
               i++;
           }
         k++;
       }
       while(i<left.length){
          A[k]=left[i];
        i++;
        k++;

    }
    while(j<right.length){
          A[k]=right[j];
        j++;
        k++;
    }
    return inversions;
   }
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a length of array ");
       int n=sc.nextInt();
       int[] lst=new int[n];
       System.out.print("Enter an array");
       for (int i=0;i<n;i++) {
           lst[i] = sc.nextInt();
       }
       int inversion=merge(lst);
       System.out.println(inversion);

   }



}
