package Linked_Lists;
import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}

public class Q2{

    Node head;

    void insertAtBeginning(int val1){
        Node newNode=new Node(val1);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    void insertAtEnd(int val2){
        Node newNode=new Node(val2);

        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.prev=temp;
    }

    void deleteFromBeginning(){
        if(head==null){
            System.out.println("List is Empty");
            return ;
        }

        head=head.next;

        if(head!=null){
            head.prev=null;
        }

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

            temp.prev.next=null;
        }

        void displayforward(){
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

        void displaybackward(){
             if(head==null){
                System.out.println("List is Empty");
                return;
            }

            Node temp=head;

            while(temp!=null){
                temp=temp.next;
            }

            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.prev;
            }
        }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Q2 list=new Q2();

        while(true){
            System.out.println("Enter you choice:");
            System.out.println("1.Insert at Beginning 2.Insert at End 3.Delete at beginning 4.Delete from end 5.Display forward 6.Display Backward 7.Exit");

            int ch=in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the value to be inserted:");
                    int val1=in.nextInt();
                    list.insertAtBeginning(val1);
                    break;

                    case 2:
                    System.out.println("Enter the value to be inserted:");
                    int val2=in.nextInt();
                    list.insertAtEnd(val2);
                    break;

                    case 3:
                        list.deleteFromBeginning();
                        break;

                        case 4:
                            list.deleteFromEnd();
                            break;

                            case 5:
                                list.displayforward();
                                break;

                                case 6:
                                    list.displaybackward();
                                      break;

                                      case 7:
                                        System.exit(0);
            
                default:
                System.out.println("Invalid choice");
                break;
            }
        }
    }

    private void deleteFromEnd() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFromEnd'");
    }
}