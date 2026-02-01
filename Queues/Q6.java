package Queues;
import java.util.*;
public class Q6{

    int arr[];
    int size,capacity;

    Q6(int n){
        capacity=n;
        arr=new int[capacity];
        size=0;
    }

    boolean isFull(){
        return size==capacity;
    }

    void swap(int a,int b){
    int temp=arr[a];
    arr[a]=arr[b];
    arr[b]=temp;
    }

    boolean isEmpty(){
        return size==0;
    }

    void insert(int val){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }

        arr[size]=val;
        int i=size;
        size++;

        //heapify up
        while(i>0 && arr[(i-1)/2]>arr[i]){
            swap(i,(i-1)/2);
            i=(i-1)/2;
        }

        System.out.println("Inserted:"+val);
    }

    int deletemin(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        int root=arr[0];

        arr[0]=arr[size-1];
        size--;

        heapifydown(0);

        return root;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } 
        
        return arr[0];
    }

    void display(){
           if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

    //heapify down
    void heapifydown(int i){
        int smallest=i;
        int left=i*2+1;
        int right=i*2+2;

        if(left<size && arr[left]<arr[smallest]){
            smallest=left;
        }

        if(right<size && arr[right]<arr[smallest]){
            smallest=right;
        }

        if(smallest!=i){
            swap(i,smallest);
            heapifydown(smallest);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        Q6 q=new Q6(n);

        int choice=0;
        while(choice!=5){
            System.out.println("1.Insert 2.Delete Min 3.Peek 4.Display 5.Exit");
            System.out.println("Enter you choice:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value to be inserted:");
                    int val=in.nextInt();
                    q.insert(val);
                    break;

                    case 2:
                      int result=q.deletemin();
                      if(result!=-1){
                          System.out.println("The element deleted from queue is:"+result);
                      }
            break;

            case 3:
                int result1=q.peek();
                      if(result1!=-1){
                          System.out.println("The smallest element from queue is:"+result1);
                      }
                      break;

                      case 4:
                        System.out.println("The queue is:");
q.display();
break;

                default:
                    break;
            }
        }
    }
}