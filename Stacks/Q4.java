package Stacks;
import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[m];
        int arr[]=new int[m];

        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }

         for(int i=0;i<m;i++){
            arr2[i]=in.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=-1;
            for(int j=i+1;j<n;j++){
            if(arr1[i]<arr1[j]){
            val=arr1[j];
            break;
            }
            }

            map.put(arr1[i],val);
        }

        int count=0;

        for(int i=0;i<m;i++){
            if(map.containsKey(arr2[i])){
                int val=map.get(arr2[i]);
                 arr[count]=val;
                 count++;
            }
        }

        for(int i=0;i<m;i++){
            System.out.println(arr[i]);
        }
    }
}
