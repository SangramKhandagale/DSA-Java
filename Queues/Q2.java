package Queues;
import java.util.*;
public class Q2{

    int arr[];
    int front,rear,size;

    Q2(int n){
        size=n;
        arr=new int[n];
        front=-1;
        rear=-1;
    }

    void Enqueue(int value){
        if(front==(rear+1)%size){
            System.out.println("Queue Overflow");
            return;
        }

        if(front==-1){
            front=0;
        }

        rear=(rear+1)%size;
        arr[rear]=value;
    }

    int dequeue(){
        if(front==-1){
            System.out.println("Queue Underflow");
            return -1;
        }

        int result=arr[front];

       if(front==rear){
        front=-1;
        rear=-1;
       }else{
         front=(front+1)%size;
       }

       return result;
    }

    void display(){
     int i=front;
     if(front==-1){
        System.out.println("Queue underflow");
     }

     while(true){
        System.out.print(arr[i]+" ");
        if(i==rear)
            break;

        i=(i+1)%size;
     }

      System.out.println();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Q2 q=new Q2(n);
        int choice=0;
        
        while(choice!=4){
       System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Exit");
       System.out.println("Enter your choice:");
choice=in.nextInt();
       switch (choice) {
        case 1:
            System.out.println("Enter the value to be inserted:");
            int value=in.nextInt();
            q.Enqueue(value);
            break;
       
            case 2:
                System.out.println("The removed value is:"+q.dequeue());
                break;

                case 3:
                    System.out.println("All the elements are:");
                    q.display();
                   
                    break;
        default:
            break;
       }
        }
    }
}
