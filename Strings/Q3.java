import java.util.*;
public class Q3{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        if(isPalindrome(str)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }
   
    
    }

    public static boolean isPalindrome(String str){
        if(str==null||str.length()==0){
            return true;
        }
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}