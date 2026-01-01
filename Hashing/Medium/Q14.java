package Hashing.Medium;
import java.util.*;
public class Q14{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        in.nextLine();
        String text=in.nextLine();
        StringBuilder newstr=new StringBuilder();
      
        int j=0;
   for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) == text.charAt(j)){
        newstr.append(str.charAt(i));
        j++;
        if(j == text.length()){ 
            break; 
        }
    } else if(j > 0){ 
        newstr.append(str.charAt(i)); 
    }
}


        System.out.println(newstr);
    }
}