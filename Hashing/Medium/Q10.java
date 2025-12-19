package Hashing.Medium;
import java.util.*;
public class Q10{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        System.out.println(map);

        int k=in.nextInt();
    
        for(int i=0;i<k;i++){
            int max_Value=Integer.MIN_VALUE;
            int max=0;
            for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>max_Value){
                max=e.getKey();
                max_Value=e.getValue();
            }
        }

        System.out.print(max+" ");
        map.remove(max);
        }

       
    }
}