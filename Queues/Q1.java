package Queues;
import java.util.*;
public class Q1{

    int arr[];
    int front,rear,size;

    Q1(int n){
        size=n;
        arr=new int[size];
        front=-1;
        rear=-1;
    }

    void Enque(int value){
        if(rear==size-1){
            System.out.println("Queue overflow");
            return;
        }

        if(front==-1){
            front=0;
        }

        rear++;
        arr[rear]=value;
    }


int DeQueue(){
    if(front==-1||front>rear){
        System.out.println("Queue Underflow");
        return -1;
    }

    int result=arr[front];
    front++;
    return result;
}

int peek(){
     if(front==-1||front>rear){
        System.out.println("Queue Underflow");
        return -1;
    }
    return arr[front];
}

void Display(){
     if(front==-1||front>rear){
        System.out.println("Queue Underflow");
        return;
    }

    for(int i=front;i<=rear;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter queue size:");
        int n=in.nextInt();
        Q1 q=new Q1(n);

        int choice=6;

        while(choice!=5){
            System.out.println("1.Insert 2.Delete 3.Peek 4.Display 5.Exit");
        System.out.println("Enter choice:");
        choice=in.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("Enter value to be inserted:");
                int value=in.nextInt();
                q.Enque(value);
                System.out.println("Inserted value:"+value);
                break;

            case 2:
                System.out.println("Deleted the value:"+q.DeQueue());
             break;

             case 3:
                System.out.println("1st value is:"+q.peek());
                break;

                case 4:
                    System.out.println("All the elements in the queue are:");
           q.Display();
           break;
           
                    default:
                break;
        }
        }
    }
}