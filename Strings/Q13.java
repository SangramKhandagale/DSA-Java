import java.util.*;
public class Q13{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
              result=result+Character.toUpperCase(ch);
            }else if(Character.isUpperCase(ch)){
                result=result+Character.toLowerCase(ch);
            }else{
               result=result+ch;
            }
        }
       
        System.out.println(result);
    }
}