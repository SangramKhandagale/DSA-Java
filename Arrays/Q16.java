 import java.util.*;

public class Q16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int a[] = new int[n];
        int p=0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                a[j] = arr[i];
                j++;
            }
        }

        if (j == 0) {               
            System.out.println(1);
            return;
        }
        
        for (int i = 0; i < j - 1; i++) {
            for (int k = i + 1; k < j; k++) {
                if (a[i] > a[k]) {  
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }

        int smallest = 1;  

        for (int i = 0; i < j; i++) {
            if (a[i] == smallest) {
                smallest++;
            } else if (a[i] > smallest) {
                break; 
            }

        }

        System.out.println(smallest);
    }
}
