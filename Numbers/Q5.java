import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();
        boolean result=whatif(year);
        System.out.println(result);
    }

    public static boolean whatif(int year){
        boolean result=false;
        if(year%400==0 || (year%4==0 && year%100!=0)){
            result=true;
        }
        return result;
    }
}