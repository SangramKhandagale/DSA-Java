import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
              arr[i]=in.nextInt();
        }

        
        int mid=0,low=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;

            }else if(arr[mid]==1){
                mid++;

            }else{
               int temp=arr[mid];
               arr[mid]=arr[high];
               arr[high]=temp;
               high--;
            }

            }

            for(int i=0;i<n;i++){
              System.out.println(arr[i]);
        }
    }
}
