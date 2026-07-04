package Endgame;
import java.util.*;

public class Q22 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        Arrays.sort(arr);

        HashMap<Integer,Integer> map = new HashMap<>();

        int diff = Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++){
            diff = Math.min(diff, arr[i+1]-arr[i]);
        }

        for(int i=0;i<n-1;i++){
            int d = arr[i+1]-arr[i];
            map.put(arr[i], d);
        }

        boolean result = true;

        int max = 0;
        int max_digit = 0;

        for(Map.Entry<Integer,Integer> e : map.entrySet()){

            if(e.getValue()!=diff){
                result=false;
            }

            if(e.getValue()>max){
                max=e.getValue();
                max_digit=e.getKey();
            }
        }

        if(result){
            int num = arr[n-1] + diff;
            System.out.println(num);
        }
        else{
            int num = max_digit + diff;
            System.out.println(num);
        }
    }
}