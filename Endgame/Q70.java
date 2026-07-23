package Endgame;
import java.util.*;
public class Q70{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();

        String[] str=str1.split(" ");

        LinkedList<Integer> list=new LinkedList<>();

        for(String x:str){
list.add(Integer.parseInt(x));
        }

        int i=list.size()/2;
        System.out.println(list.get(i));
    }
}