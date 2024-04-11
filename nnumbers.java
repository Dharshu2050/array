import java.util.Scanner;

public class nnumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you wants to enter: (max is 20)");
        int n=sc.nextInt();
        
        while (n<=0||n>20) {
            System.out.println("invaild number");
            n =sc.nextInt();
        }

        int number[]=new int[n];
        for(int i=0;i<n;i++){
           number[i]=sc.nextInt();
        }
       
    }
}
