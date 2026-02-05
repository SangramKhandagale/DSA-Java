package Linked_Lists;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
     this.next=null;
    }
}

public class Q1{

    Node head;

    void insertAtBeginning(int data){
        Node newNode=new Node(data);

        newNode.next=head;
        head=newNode;
    }

    void inserAtEnd(int data){
        Node newnode=new Node(data);

        if(head==null){
            head=newnode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newnode;
    }

    void insertAtPosition(int data,int pos){
        Node newNode=new Node(data);

        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node temp=head;

        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    void deleteFromBeginning(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        head=head.next;
    }

    void deleteFromEnd(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

     if(head.next==null){
        head=null;
        return;
     }

     Node temp=head;

     while(temp.next!=null){
        temp=temp.next;
     }

     temp.next=null;


    }

    void deleteAtPosition(int pos){
        if(head==null){
            return;
        }

        if(pos==1){
            head=head.next;
            return;
        }

        Node temp=head;

        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }

        temp.next=temp.next.next;
    }

    void display(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    void reverse() {

    Node prev=null;
    Node next=null;
    Node curr=head;

    while(curr!=null){
        
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }

    head=prev;
}

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

             Q1 list = new Q1();

        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        list.inserAtEnd(30);
        list.inserAtEnd(40);

        System.out.println("After Insertions:");
        list.display();

        list.deleteFromBeginning();
        System.out.println("After deleting from beginning:");
        list.display();

        list.deleteFromEnd();
        System.out.println("After deleting from end:");
        list.display();

        in.close();

    }
}