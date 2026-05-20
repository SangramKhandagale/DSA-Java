import java.util.*;
public class Q17{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        int i=1;
        
        while(!((i%a)==0)&&((i%b)==0)&&((i%c)==0)){
          i++;
        }

        System.out.println(i);
    }
}
