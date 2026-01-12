package Stacks;
import java.util.*;
class Stack {
    int arr[];
    int top = -1;
    int size;

    Stack(int size) {
        this.size = size;      // ✅ FIX 1
        arr = new int[size];
    }

    void push(int num) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = num;      // ✅ FIX 2
        System.out.println("Pushed " + num);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top--] + " Popped");
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
}

public class Q1{ 
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in); 
         int choice; 
         Stack s=new Stack(5);
          while(true){ 
            System.out.println("1.Push 2.Pop 3.Peek 4.Exit"); 
            choice=in.nextInt();
             if(choice==4){
                 break; 
                } switch(choice){
                    case 1: System.out.println("Enter the element to be pushed:");
                     int num=in.nextInt();
                      s.push(num);
                       break;
                       
                       case 2: 
                       System.out.println("Enter element to be popped:"); 
                       s.pop();
                        break;

                         case 3: 
                         System.out.println("Peek element:"+s.peek());
                          break;

                           default: System.out.println("Invalid Choice!!!"); }
                         }
                         }

                         }