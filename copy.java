import java.util.Scanner;

public class copy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
        for(int i=0;i<n;i++){
            b[i]=arr[i];
        }
        System.out.println(b);
    }
}
