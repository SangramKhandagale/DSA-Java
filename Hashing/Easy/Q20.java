package Hashing.Easy;
import java.util.*;

public class Q20{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

    HashMap<Integer,Integer> map=new HashMap<>();

    for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i], 0)+1);

    }

int max=0;
int maxElement=0;

for(Map.Entry<Integer,Integer> e:map.entrySet()){
    if(max<e.getValue()){
        max=e.getValue();
        maxElement=e.getKey();
    }
}

System.out.println(maxElement);
    }
}
