import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);
    }
}