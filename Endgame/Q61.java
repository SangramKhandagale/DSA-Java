package Endgame;
import java.util.*;
public class Q61{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();

        while(n!=1){
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    n=n/i;
                    list.add(i);
                    break;
                }
            }
        }

        Collections.sort(list);

        System.out.println(list);
    }
}