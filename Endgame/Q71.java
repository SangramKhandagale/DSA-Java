package Endgame;
import java.util.*;
import java.util.Stack;
public class Q71{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Stack<String> st=new Stack<>();

        for(int i=0;i<n;i++){
            st.push(in.next());
        }

        int m=in.nextInt();

        for(int i=0;i<m;i++){
            st.pop();
        }
Queue<Integer> q=new LinkedList<Integer>();

    if(st.isEmpty()){
        System.out.println(true+" "+0+" "+0);
    }else{
         System.out.println(false+" "+st.peek()+" "+st.size());
    }

     
    }
}