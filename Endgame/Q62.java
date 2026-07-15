package Endgame;
import java.util.*;
public class Q62{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }


        int key=in.nextInt();
        int low=0;
        int high=n-1;
          int found=0;
          int f=0;

        while(low<=high){
             int mid=(low+high)/2;

            if(arr[mid]==key){
                f=mid;
            found++;
            break;
            }else if(arr[mid]>key){
             high=mid-1;
            }else{
                low=mid+1;
            }
        }

        if(found==1){
            System.out.println("found at:"+f);
        }else if(found==0){
            int diff1=arr[low]-key;
            int diff2=key-arr[high];

            if(diff1<diff2){
                System.out.println(arr[low]);
            }else{
                System.out.println(arr[high]);
            }
            
            if(diff1==diff2){
             if(arr[low]<arr[high]){
                System.out.println(arr[low]);
             }else{
                System.out.println(arr[high]);
            }
            }
        }

    }
}