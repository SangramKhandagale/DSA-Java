package Endgame;
import java.util.*;
public class Q45{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();

Stack<Integer> stack=new Stack<>();

for(char c:str.toCharArray()){
    if(c=='('){
        stack.push(0);
    }
    else{
        int top=stack.pop();

        int score;

        if(top==0){
            score=1;
        }else{
            score=2*top;
        }

        stack.push(stack.pop()+score);
    }}
    

System.out.println(stack.pop());

}

    }
