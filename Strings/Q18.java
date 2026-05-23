import java.util.*;
public class Q18{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();

        String new_str=new StringBuilder(str).reverse().toString();

        System.out.println(new_str);
    }
}