package Hashing;
import java.util.*;
public class Q6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

boolean result=false;

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>1){
                result=true;
            }
        }

        System.out.println(result);
    }
}