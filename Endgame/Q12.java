import java.util.*;

public class Q12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String arr[] = new String[str.length()];
        String new_str = "";
        int j = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                arr[j] = new_str;
                j++;
                new_str = "";
            } else {
                new_str = new_str + str.charAt(i);

                if (i == str.length() - 1) {
                    arr[j] = new_str;
                    break;
                }
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.println(arr[i]);
        }

        int i = 0;
        int m = j;

        while (i < j) {

            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("---------------");

        for (int f = 0; f <= m; f++) {
            System.out.println(arr[f]);
        }
    }
}