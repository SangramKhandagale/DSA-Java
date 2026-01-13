package Stacks;
import java.util.*;
import java.util.Stack;

public class Q2{

    public static boolean isValid(String str){
        Stack<Character> stack=new Stack<>();

        for(char c:str.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }

                char top=stack.pop();
                
                if(top!='{' && c=='}') return false;
                  if(top!='[' && c==']') return false;
                    if(top!='(' && c==')') return false;
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();

        if(isValid(str)){
            System.out.println("Valid Parenthesis");
        }else{
            System.out.println("Invalid Parenthesis");
        }
    }
}