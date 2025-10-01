import java.util.*;
public class Q23{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextLine();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i].length()<arr[j].length()){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

         for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}