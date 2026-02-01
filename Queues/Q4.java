package Queues;
import java.util.*;
public class Q4{

    int arr[];
    int front,rear,size;

    Q4(int n){
        size=n;
        arr=new int[size];
        front=-1;
        rear=-1;
    }

    boolean isEmpty(){
        return front==-1;
    }

    boolean isFull(){
        return front==(rear+1)%size;
    }

    void insertfromfront(int val1){
    if(isFull()){
        System.out.println("Queue is Full");
        return;
    }

    if(front==-1){
        front=rear=0;
    }else if(front==0){
        front=size-1;
    }else{
        front--;
    }

    arr[front]=val1;

    }

    void insertfromrear(int val2){
        if(isFull()){
            System.out.println("Queue is Full");
        return;
        }

        if(front==-1){
            front=rear=0;
        }
        else{
            rear=(rear+1)%size;
        }

        arr[rear]=val2;
    }

    int deletefromfront(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int result=arr[front];

        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }

        return result;
    }

    int deletefromrear(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int result=arr[rear];

        if(front==rear){
            front=rear=-1;
        }else if(rear==0){
            rear=size-1;
        }else{
            rear--;
        }

        return result;
    }

    void display(){
         if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        
        int i=front;

        while(true){
            System.out.print(arr[i]+" ");

            if(i==rear){
                break;
            }

            i=(i+1)%size;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Queue size:");
        int n=in.nextInt();
        Q4 q=new Q4(n);
        int choice=0;
        while(choice!=6){
            System.out.println("1.Insert from front  2.Insert from rear  3. Delete from front  4.Delete from reaar  5.Display  6.Exit");
        System.out.println("Enter your choice:");
        choice=in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the value to be inserted:");
                int val1=in.nextInt();
                q.insertfromfront(val1);
                break;

                  case 2:
                System.out.println("Enter the value to be inserted:");
                int val2=in.nextInt();
                q.insertfromrear(val2);
                break;

                  case 3:
                    int result=q.deletefromfront();
             if(result!=-1){
                   System.out.println("The value deleted from rear is:"+ result);
             }
                break;

                  case 4:
                    int result2=q.deletefromrear();
             if(result2!=-1){
                   System.out.println("The value deleted from front is:"+ result2);
             }
                break;
                
                case 5:
                    System.out.println("The queue is:");
                    q.display();
        
            default:
                break;
        }
        }
    }
}