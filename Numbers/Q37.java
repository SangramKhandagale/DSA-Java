import java.util.*;
public class Q37{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String str=String.valueOf(n);
        int count=0;
     
         if(str.charAt(0)=='0'){
                System.out.println("Not duck");
            }

         for(int j=1;j<str.length();j++){
            if(str.charAt(j)=='0'){
                count++;
            }
            }

            if(count>=1){
                System.out.println("Duck");
            }else{
                System.out.println("Not duck");
            }

    }
}