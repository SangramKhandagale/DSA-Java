import java.util.*;

public class Q54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int ans[] = new int[n];
        int count = 0;

        int maxDominant = -1;
        int pos = -1;

        for(int i=0;i<n;i++){

            ans[i] = -1;

            for(int j=i+1;j<n;j++){

                if(arr[j] > arr[i]){
                    ans[i] = arr[j];
                    break;
                }
            }

            if(ans[i] == -1){
                count++;

                if(arr[i] > maxDominant){
                    maxDominant = arr[i];
                    pos = i + 1;
                }
            }
        }

        for(int x : ans){
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println(count);
        System.out.println(pos);
    }
}