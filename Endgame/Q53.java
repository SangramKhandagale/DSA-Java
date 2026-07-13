package Endgame;
import java.util.*;
public class Q53{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }

    HashMap<Integer,Integer> map=new HashMap<>();

    map.put(0,-1);

    int count=0,sum=0;

    for(int i=0;i<n;i++){
        sum=sum+arr[i];

        if(map.containsKey(sum-k)){
int start=map.get(sum-k)+1;
int end=i;

System.out.println(start+" "+end);
break;
        }

        if(!map.containsKey(sum-k)){
             map.put(sum,i);
        }
    }
    
System.out.println(count);

    }
}