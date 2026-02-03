package Heaps;
import java.util.*;

public class Q6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Enter K:");
        int k = in.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

      for(int i=0;i<k;i++){
            int max_freq=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
           if(e.getValue()>max_freq){
            max_freq=e.getKey();
           }
            }

            System.out.println(max_freq);
            map.remove(max_freq);
    
    }}}