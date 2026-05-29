import java.util.*;
public class Q32{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int count=0;
         char ch=str.charAt(0);
String new_str="";
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)==ch){
            count++;
           }else{
            new_str=new_str+ch+count;
            count=1;
            ch=str.charAt(i);
           }

           
        }

        new_str=new_str+ch+count;

       if(new_str.length()<str.length()){
        System.out.println(new_str);
       }else{
        System.out.println(str);
       }
    }
}