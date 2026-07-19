package Endgame;
import java.util.*;

public class Q65 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int k = in.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int i = 0; i < n; i++){

            if(map.containsKey(arr[i])){
                continue;
            }

            for(int j = i + 1; j < n; j++){

                if(map.containsKey(arr[j])){
                    continue;
                }

                int c = arr[i] + arr[j];

                if(c % k == 0){

                    count++;

                    map.put(arr[i], 1);
                    map.put(arr[j], 1);

                    break; // arr[i] ka pair mil gaya
                }
            }
        }

        System.out.println(count);
    }
}