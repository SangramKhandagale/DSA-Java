package Queues;
import java.util.*;
public class Q7{

    int arr[];
    int size,cap;

    Q7(int n){
        cap=n;
        arr=new int[cap];
        size=0;
    }

    boolean isEmpty(){
        return size==0;
    }

    boolean isFull(){
        return size==cap;
    }

    void swap(int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    void heapifydown(int i){
        int largest=i;
        int left=i*2+1;
        int right=i*2+2;

        if(left<size && arr[left]>arr[largest]){
            largest=left;
        }

        if(right<size && arr[right]>arr[largest]){
            largest=right;
        }

        if(largest!=i){
            swap(largest,i);
            heapifydown(largest);
        }
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

        while(i>0 && arr[(i-1)/2]<arr[i]){
            swap(i,(i-1)/2);
            i=(i-1)/2;
        }
    }

    int deletemax(){
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

    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Q7 q=new Q7(n);
        int choice=0;

        while(choice!=5){
            System.out.println("1.Insert 2.Delete max 3.Peek 4.Display 5.Exit");
            System.out.println("Enter the choice:");
            choice=in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int val=in.nextInt();
                    q.insert(val);
                    break;

                    case 2:
                        int res1=q.deletemax();
                        if(res1!=-1){
                            System.out.println("The max element deleted from priority queue is:"+res1);
                        }
                        break;

                        case 3:
                        int res2=q.peek();
                        if(res2!=-1){
                            System.out.println("The max element from priority queue is:"+res2);
                        }
                        break;

                        case 4:
                            System.out.println("The priority queue is:");
                            q.display();
                            break;

                default:
                    break;
            }
        }
    }
}