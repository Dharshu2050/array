import java.util.*;

public class largest {
    public static void main(String[] args) {
        int arr[]={10,342,40,80,999};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
               max=arr[i];
        }
         System.out.println(max);
            
        
    }
}
