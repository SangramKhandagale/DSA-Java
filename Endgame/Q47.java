package Endgame;
import java.util.*;

public class Q47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int arr[][] = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while(top <= bottom && left <= right) {

            // Left -> Right
            for(int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // Top -> Bottom
            for(int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Right -> Left
            if(top <= bottom) {
                for(int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // Bottom -> Top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }

        in.close();
    }
}