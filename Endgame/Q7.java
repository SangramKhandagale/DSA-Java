import java.util.*;

public class Q7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        if(n == 0){
            System.out.println(0);
            return;
        }

        Arrays.sort(arr);

        int count = 1;
        int max_count = 1;

        for(int i = 0; i < n - 1; i++) {

            if(arr[i] == arr[i + 1]) {
                continue;         
            }
            else if(arr[i] + 1 == arr[i + 1]) {
                count++;
            }
            else {
                count = 1;
            }

            max_count = Math.max(max_count, count);
        }

        System.out.println(max_count);
    }
}