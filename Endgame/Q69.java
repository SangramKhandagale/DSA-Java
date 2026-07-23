package Endgame;
import java.util.*;

public class Q69 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();

        for(int i = 0; i < n; i++)
            list1.add(in.nextInt());

        for(int i = 0; i < m; i++)
            list2.add(in.nextInt());

       int k = 0, j = 0;

while(k < n || j < m)
{
    if(k < n)
        list3.add(list1.get(k++));

    if(j < m)
        list3.add(list2.get(j++));
}

     PriorityQueue<Integer> q=new PriorityQueue<>();

     for(int i=0;i<list3.size();i++){
         if(i%2!=0){
            q.add(list3.get(i));
         }
     }

 for(int i=0;i<list3.size();i++){

    if(i%2!=0){
          int value=q.poll();
        list3.set(i,value);
    }
 }

 System.out.println(list3);
    }

    
}