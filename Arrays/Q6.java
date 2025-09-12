import java.util.*;
public class Q6{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
       arr[i]=in.nextInt();
    }
   
    insertionSort(arr);

    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}

public static void insertionSort(int arr[]){
    for(int i=0;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
       while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j--;
       }
       arr[j+1]=key;
    }
}
}