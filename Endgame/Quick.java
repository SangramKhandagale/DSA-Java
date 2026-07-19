package Endgame;
import java.util.*;
public class Quick{

    public static void QuickSort(int arr[],int low,int high){
        if(low<high){
            int partition=partition(arr,low,high);

            QuickSort(arr, low, partition);
            QuickSort(arr, partition+1, high);
        }
    }

    public static int partition(int arr[],int low,int high){
        int i=low-1;
        int pivot=arr[high];

        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i++];
        arr[i++]=arr[high];
        arr[high]=temp;

        return i+1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        

        QuickSort(arr,0,n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}