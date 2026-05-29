import java.util.*;
public class Q29{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String new_str="";

        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                new_str=new_str+ Character.toLowerCase(str.charAt(i));
            }else if(Character.isLowerCase(str.charAt(i))){
                new_str=new_str+Character.toUpperCase(str.charAt(i));
            }else if(str.charAt(i)==' '){
                new_str=new_str+str.charAt(i);
            }
        }

        System.out.println(new_str);
    }
}