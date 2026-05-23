import java.util.*;
public class Q15{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        String new_str = "";

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(c >= 'a' && c <= 'z'){
              
                new_str += (char)((c - 'a' + k) % 26 + 'a');
            } else if(c >= 'A' && c <= 'Z'){
               
                new_str += (char)((c - 'A' + k) % 26 + 'A');
            } else {
             
                new_str += c;
            }
        }

        System.out.println(new_str);
    }
}