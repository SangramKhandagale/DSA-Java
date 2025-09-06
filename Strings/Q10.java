import java.util.*;
public class Q10{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();

        printSubsets(str,0,"");
    }

    public static void printSubsets(String str,int index,String current){
        if(index==str.length()){
            System.out.println(current);
            return;
        }

        printSubsets(str, index+1, current);
        printSubsets(str, index+1, current+str.charAt(index));
    }
}