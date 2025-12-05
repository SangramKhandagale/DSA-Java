package Hashing;
import java.util.*;

public class Q18{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);

    }

  ArrayList<Integer> list=new ArrayList<>();

    for(Map.Entry<Integer,Integer> e:map.entrySet()){
        if(e.getValue()==target){
           list.add(e.getKey());
        }
    }

System.out.println(list);
    }
}
