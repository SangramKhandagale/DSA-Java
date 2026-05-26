import java.util.*;

public class Q25 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String arr[] = new String[10];

        String new_str = "";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                new_str = new_str + str.charAt(i);
            } 
            else {
                arr[count] = new_str;
                count++;
                new_str = "";
            }
        }

        arr[count] = new_str;

        int j = 0;
        int k = count;

        while (j < k) {

            String temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;

            j++;
            k--;
        }

        for (int i = 0; i <= count; i++) {
            System.out.println(arr[i]);
        }
    }
}