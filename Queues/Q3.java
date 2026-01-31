package Queues;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Q3{

    Node front,rear;

    Q3(){
        front=null;
        rear=null;
    }

    void Enqueue(int value){
        Node newnode=new Node(value);

        if(front==null){
            front=rear=newnode;
        }else{
            rear.next=newnode;
            rear=newnode;
        }
    }

    int DeQueue(){
        if(front==null){
            System.out.println("Queue is Empty");
            return -1;
        }

        int result=front.data;
        front=front.next;

        if(front==null){
            rear=null;
        }

        return result;
    }

    int peek(){
        if(front==null){
            System.out.println("Queue is empty");
            return -1;
        }

        return front.data;
    }

    void Display(){
        if(front==null){
            System.out.println("Queue is Empty");
            return;
        }

        Node temp=front;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Q3 q=new Q3();

        int choice=0;
        while(choice!=5){
            System.out.println("1.Enqueue 2.Dequeue 3.Peek 4.Display 5.Exit");
            System.out.println("Enter you choice:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to be entered:");
                    int value=in.nextInt();
                    q.Enqueue(value);
                    break;

                    case 2:
                   int removed = q.DeQueue();
                    if (removed != -1)
                        System.out.println("Removed: " + removed);
                    break;

                    
                    case 3:
                    int top = q.peek();
                    if (top != -1)
                        System.out.println("Front element: " + top);
                    break;

                    case 4:
                        System.out.println("All the elements are:");
                        q.Display();
                        break;
            
                default:
                    break;
            }
        }
    }
}