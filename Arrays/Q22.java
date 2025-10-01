import java.util.*;
public class Q22{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr[]=new int[m+n];
        int o=m+n;
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }

         for(int i=0;i<m;i++){
            arr2[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
           arr[i]=arr1[i];
        }

        for(int i=0;i<m;i++){
           arr[i+n]=arr2[i];
        }

        for(int i=0;i<o;i++){
            for(int j=0;j<o;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<o;i++){
          System.out.print(arr[i]+" ");
        }
    }
}