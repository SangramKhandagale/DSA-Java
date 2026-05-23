import java.util.*;
public class Q16{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int vowels=0,constant=0,space=0,digits=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowels++;
            }else if(str.charAt(i)==' '){
                space++;
            }else if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||str.charAt(i)=='8'||str.charAt(i)=='9'){
                digits++;
            }else{
                constant++;
            }

        }
System.out.println("Vowels:"+vowels+" "+" Constants:"+constant+" Spaces:"+space+" Digits:"+digits);
    }
}