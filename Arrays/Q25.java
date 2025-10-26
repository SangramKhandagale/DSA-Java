import java.util.*;
public class Q25{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
         int n=in.nextInt();
        
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int target=in.nextInt();
        int found=0;

        for(int i=0;i<n;i++){
           if(arr[i]==target){
            found=i;
           }
        }

       if(found==0){
        System.out.println(-1);
       }else{
         System.out.println(found);
       }

    }
}
