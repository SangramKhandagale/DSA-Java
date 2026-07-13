package Endgame;
import java.util.*;

public class Q56 {

    public static void mergeSort(int arr[], int low, int high) {

        if(low >= high){
            return;
        }

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high){

        ArrayList<Integer> list = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){

            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }

        while(left <= mid){
            list.add(arr[left]);
            left++;
        }

        while(right <= high){
            list.add(arr[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            arr[i] = list.get(i - low);
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];
        int arr[] = new int[n + m];

        for(int i=0;i<n;i++){
            arr1[i] = in.nextInt();
        }

        for(int i=0;i<m;i++){
            arr2[i] = in.nextInt();
        }

        for(int i=0;i<n;i++){
            arr[i] = arr1[i];
        }

        for(int i=n;i<n+m;i++){
            arr[i] = arr2[i-n];
        }

        mergeSort(arr, 0, n+m-1);

        for(int i=0;i<n+m;i++){
            System.out.print(arr[i] + " ");
        }
    }
}