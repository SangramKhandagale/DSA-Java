package Endgame;
import java.util.*;
public class Merge{

    public static void mergeSort(int arr[],int low,int high){
        if(low>=high){
            return;
        }

        int mid=(low+high)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,high,mid);
    }

    public static void merge(int arr[],int low,int high,int mid){
        int i=low;
        int j=mid+1;
        int k=0;
        int temp[]=new int[high-low+1];

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }

        while(j<=high){
            temp[k++]=arr[j++];
        }

        for( i=low,k=0;i<=high;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        mergeSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}