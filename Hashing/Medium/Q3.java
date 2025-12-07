package Hashing.Medium;
import java.util.*;

public class Q3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Enter target:");
        int m = in.nextInt();

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    for(int l = k+1; l < n; l++){
                        if(arr[i] + arr[j] + arr[k] + arr[l] == m){
                            List<Integer> quad = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            if(!list.contains(quad)) list.add(quad);
                        }
                    }
                }
            }
        }

        System.out.println(list);
    }
}
