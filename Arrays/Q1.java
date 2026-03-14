
import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            
            arr[i]=in.nextInt();
        }
       System.out.println("Largest number: "+max(arr));
       System.out.println("Smallest number: "+min(arr));
    }

    public static int max(int arr[]){
        
        int max=0;
         for(int i=0;i<arr.length;i++){
            max=arr[i];
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]<arr[j]){
                    max=arr[j];
                }
            }
         }
          return max;
    }

    
      public static int min(int arr[]){
        int min=0;
         for(int i=0;i<arr.length;i++){
            min=arr[i];
            for(int j=0;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    min=arr[j];
                }
            }
         }
          return min;
    }
}

