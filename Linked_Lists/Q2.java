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
}