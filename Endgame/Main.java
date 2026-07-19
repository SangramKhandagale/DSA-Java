package Endgame;
import java.util.*;

class Stack{
private int arr[];
private int top;

public Stack(int size){
arr=new int[size];
top=-1;
}

public void push(int value){
if(top==arr.length-1){
System.out.println("Overflow");
return;
}

arr[++top]=value;
}

public int pop(){
if(top==-1){
System.out.println("Underflow");
return -1;
}

int value=arr[top];
top--;
return value;
}

public int peek(){
if(top==-1){
System.out.println("Underflow");
return -1;
}

return arr[top];
}

public boolean isEmpty(){
return top==-1;
}

}

public class Main{

public static int evaluatePostfix(String str){
Stack st=new Stack(str.length());

for(int i=0;i<str.length();i++){
char ch=str.charAt(i);


if(ch==' '){
continue;
}

if(Character.isDigit(ch)){
st.push(ch-'0');
}else{
int a=st.pop();
int b=st.pop();

switch(ch){
case '+':st.push(a+b);
break;

case '-':st.push(b-a);
break;

case '*':st.push(a*b);
break;

case '/':st.push(b/a);
break;
}
}

}

return st.pop();
}

public static void main(String args[]){
    Scanner in=new Scanner(System.in);
String str=in.nextLine();

int answer=evaluatePostfix(str);

System.out.println(answer);
}
}

























