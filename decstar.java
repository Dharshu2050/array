public class decstar {
    public static void main(String[] args) {
        //for 1<=5 true next loop 5>=1 true print * j -- decreament j=4 4>=1 ture print * util 5*print next line 
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
