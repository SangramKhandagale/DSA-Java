import java.util.*;
public class Q20{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        int k=in.nextInt();

        System.out.println(arr[k-1]);
    }
}