import java.util.*;

public class Q55 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        long count = 0;
        int max_len = 0;

        for(int i=0;i<n;i++){

            long sum = 0;
            int len = 0;

            for(int j=i;j<n;j++){

                sum += arr[j];
                len++;

                if(sum % k == 0){

                    count++;

                    if(len > max_len){
                        max_len = len;
                    }
                }
            }
        }

        System.out.println(count);
        System.out.println(max_len);
    }
}