package Stacks;
import java.util.*;

public class Q3 {

    static class StackUsingQueue {
        int arr[];
        int front, rear, size, capacity;

        StackUsingQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int x) {
            if (size == capacity) {
                System.out.println("Queue overflow");
                return;
            }
            rear++;
            arr[rear] = x;
            size++;
        }

        int dequeue() {
            if (size == 0) {
                System.out.println("Queue underflow");
                return -1;
            }
            int val = arr[front];
            front++;
            size--;
            return val;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[front];
        }

        void push(int x) {
            enqueue(x);

            int k = size;
            for (int i = 0; i < k - 1; i++) {
                enqueue(dequeue());
            }

            System.out.println("Pushed into stack");
        }

        int pop() {
            int val = dequeue();
            if (val != -1) {
                System.out.println("Popped from stack: " + val);
            }
            return val;
        }

        int top() {
            int val = peek();
            if (val != -1) {
                System.out.println("Top element: " + val);
            }
            return val;
        }

        boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter capacity:");
        int n = in.nextInt();

        StackUsingQueue s = new StackUsingQueue(n);

        while (true) {
            System.out.println("\n1.Push  2.Pop  3.Top  4.Empty  5.Exit");
            System.out.print("Enter choice: ");
            int ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element to be pushed: ");
                    int x = in.nextInt();
                    s.push(x);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.top();
                    break;

                case 4:
                    System.out.println(s.isEmpty());
                    break;

                case 5:
                    System.out.println("Exited");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
