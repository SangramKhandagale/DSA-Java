package Endgame;

import java.util.*;
public class Q36{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

int target=0;

Arrays.sort(arr);

for(int i=0;i<n-2;i++){
  if(i>0 && arr[i]==arr[i-1]){
            continue;
        }

    int left=i+1;
    int right=n-1;

    while(left<right){

        int sum=arr[i]+arr[left]+arr[right];

        if(sum==target){
            System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);

             while(left<right && arr[left]==arr[left+1]){
                left++;
             }

             while(left<right && arr[right]==arr[right-1]){
                right--;
             }

               left++;
             right--;
        }else if(sum<target){
            left++;
        }else{
            right--;
        }


    }
}

    }
}