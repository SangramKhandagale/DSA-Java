import java.util.*;
public class Q48{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        String octal=Integer.toOctalString(n);

        System.out.println(octal);

        String rev=new StringBuilder(octal).reverse().toString();

        if(octal.equals(rev)){
System.out.println("Yes");
        }else{
System.out.println("No");
        }

        int digit=0;

        for(int i=0;i<octal.length();i++){
            digit=digit+octal.charAt(i)-'0';
        }

        System.out.println(digit);

        int count=0;

        for(int i=0;i<=n;i++){
            String oct=Integer.toOctalString(i);

            String r=new StringBuilder(oct).reverse().toString();

            if(oct.equals(r)){
                count++;
            }
        }

        System.out.println(count);


    }
}