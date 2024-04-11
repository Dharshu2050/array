public class occrrences {
    public static void main(String[] args) {
        int a[]={1,4,8,4,1,6,7};
        for (int i = 0; i < a.length; i++) {
            int temp=0;
            int count=0;
           while (a[i]==temp) {
            temp=a[i];
            System.out.println(temp);
            
           }
           count++;
        }
    }
}
