import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        map.put(0,-1);

        for(int i=0;i<n;i++){

            if(arr[i] == 0){
                sum += -1;
            }else{
                sum += 1;
            }

            if(map.containsKey(sum)){

                int len = i - map.get(sum);

                maxLen = Math.max(maxLen,len);

            }else{

                map.put(sum,i);

            }
        }

        System.out.println(maxLen);
    }
}