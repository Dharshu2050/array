import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        //for loop use elemants print 
        int a[]={1,5,9,7,6};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //for loop use geting input from user
        Scanner sc=new Scanner(System.in);
        int b[]=new int[6];
        for(int j=0;j<b.length;j++){
           b[j]=sc.nextInt();
        }

    }
}
