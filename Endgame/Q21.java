import java.util.*;
import java.util.Map.Entry;
public class Q21{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int num=n;
        int d=num/3;

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
         if(e.getValue()>d){
            System.out.println(e.getKey());
         }
        }

    }
}