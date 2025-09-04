import java.util.*;
public class Q8{
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String str1=in.nextLine();
    String str2=in.nextLine();
    boolean result=result(str1,str2);
    System.out.println(result);
}
public static boolean result(String str1,String str2){
    char[] arr1=str1.toCharArray();
    char[] arr2=str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    boolean res=false;
    if(Arrays.equals(arr1, arr2)){
       res=true;
    }
    return res;
}
}