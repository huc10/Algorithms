import java.util.Scanner;


public class Multi_subarray {
    static int max_prof(int[] A){
        int min=A[0];
        int profit=0;
        int baseprofit=0;
        int sum=0;
        int n=A.length;

        for(int i=1;i<n;i++) {
            profit = A[i] - min;

            baseprofit = (profit > baseprofit) ? profit : baseprofit;

            if (A[i] < min) {
                min = A[i];
            }
        }
        return baseprofit;
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
        int profit=max_prof(A);

        System.out.println(profit);
    }

}
