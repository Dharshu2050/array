public class decreamentstar {
    public static void main(String[] args) {
        //for i=1 1<=5 next for loop - j=1 1<=1 condition ture so print * j-- decreament j=0 0<=1 condition false ,next line ,i decreament i=0  0<=5 
        //true next loop 1<=0 false new line 
      for (int i = 5; i <= 1; i--) {
       for(int j=5;j<=i;j--){
           System.out.println("*");
       }
       System.out.println("\n");
      }
    }
}
