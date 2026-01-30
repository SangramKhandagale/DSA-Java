import java.util.*;

public class Q9{

    int arr[];

    public static boolean Valid(String str){
        char stack[]=new char[str.length()];
        int top=-1;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
              top++;
              stack[top]=ch;
            }else{
                if(top==-1){
                    return false;
                }

                char last=stack[top];
                top--;

                if((ch==')' && last!='(')||
            (ch=='}' && last!='{')||
            (ch==']' && last!='[')
            ){
                 return false;
            }
            }
        }

        return top==-1;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        boolean result=Valid(str);
        System.out.println(result);
    }
}