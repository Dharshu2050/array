public class starpattern {
    public static void main(String[] args) {
        //for loop -loop aagurathugaka ,i 1,i<=5,i++,sop - *
      //step 1- i<=5 -true next for loop 1<=1 * print j++ increament j=2 2<=1 -false next line 
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print( " * ");  
            }
            System.out.print("\n");
         
        }
    }
}
