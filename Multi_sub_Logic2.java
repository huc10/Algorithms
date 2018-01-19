import java.util.Arrays;
import java.util.Scanner;

public class Multi_sub_Logic2 {
        static int[] max_prof(int[] A){
            int low_ind=0;
            int high_ind=0;
            int low_te=0;
            int sum=0;
            int max_profit=0;

            int n=A.length;

            for(int i=0;i<n;i++) {
                sum = sum+ A[i];

                if(sum>max_profit){
                    high_ind=i;
                    max_profit=sum;
                    low_ind=low_te;
                }

                if (sum<0) {
                    low_te=i+1;
                    sum=0;

                }
            }
            int[] B=new int[3];
            B[0]=low_ind;
            B[1]=high_ind;
            B[2]=max_profit;
            return B;
        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter length of days");
            int n= sc.nextInt();
            int[] A=new int[n];
            System.out.println("Enter prices in seq");
            for(int i=0;i<n;i++){
                A[i]=sc.nextInt();
            }
            int[] profit=max_prof(A);

            System.out.println(Arrays.toString(profit));
        }



}
