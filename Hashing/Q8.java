package Hashing;
import java.util.*;
public class Q8{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Enter target:");
        int target=in.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<n;i++){
             int need = target - arr[i];

    if(map.containsKey(need) && map.get(need) != i){
        System.out.println(i + " " + map.get(need));
        return;
    }
        }

        System.out.println(set);
    }
}