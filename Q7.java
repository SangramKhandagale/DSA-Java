import java.util.*;
public class Q7 {
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    boolean result=result(str);
   System.out.println(result);
    }

    public static boolean result(String str){
        boolean res=false;
         if(str.matches("[0-9]+")){
res=true;
    }
    return res;
    }
}    

