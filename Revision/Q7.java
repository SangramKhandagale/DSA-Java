package Revision;
import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Q7 sol=new Q7();
        String str=in.nextLine();
         int i=0;
        int j=str.length()-1;
        boolean result=Palindrome(str,i,j);
        System.out.println(result);
    }

    public static boolean Palindrome(String str,int i,int j){
        if(i>=j){
            return true;
        }else{
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
       return Palindrome(str, i+1, j-1);
    }
}