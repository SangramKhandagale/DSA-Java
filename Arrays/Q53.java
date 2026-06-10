import java.util.*;

public class Q53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int swap = 0;

        for(int i=0;i<n-1;i++){

            if(i%2==0){

                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }

            }else{

                if(arr[i] < arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swap++;
                }

            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println(swap);
    }
}