import java.util.*;
public class Q15{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        

        System.out.println("Enter rotations:");
        int rotate=in.nextInt();

        for(int x=0;x<rotate;x++){
            int temp=arr[arr.length-1];
           for(int i=arr.length-2;i>=0;i--){
             arr[i+1]=arr[i];
           }
           arr[0]=temp;
        }

        System.out.println("Result:-");
        for(int x:arr){
            System.out.println(x);
        }
    }
}
