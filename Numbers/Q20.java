import java.util.*;
public class Q20{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();
        int arr[]=new int[n];
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int m=0;
        for(int i=0;i<n;i++){
            boolean isDuplicate=false;
            for(int j=0;j<m;j++){
                if(arr[i]==a[j]){
                    isDuplicate=true;
                    break;
                }
            }
             if(!isDuplicate){
                    a[m]=arr[i];
                    m++;
                }
        }
System.out.println("New:-");
         for(int i=0;i<m;i++){
           System.out.println(a[i]);
        }
    }
}