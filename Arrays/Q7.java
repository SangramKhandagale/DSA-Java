import java.util.*;
public class Q6{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
       arr[i]=in.nextInt();
    }
   
    selectionSort(arr);

    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
}

public static void selectionSort(int arr[]){
    for(int i=0;i<arr.length;i++){
      int minIndex=i;
      for(int j=i+i;j<arr.length;j++){
        if(arr[j]<arr[minIndex]){
            minIndex=j;
        }
      }
      int temp=arr[minIndex];
      arr[minIndex]=arr[i];
      arr[i]=temp;
    }
}
} 