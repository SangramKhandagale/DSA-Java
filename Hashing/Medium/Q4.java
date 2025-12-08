package Hashing.Medium;
import java.util.*;
public class Q4{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];

    for(int i=0;i<n;i++){
    arr[i]=in.nextInt();
    }
    
    int k=in.nextInt();

    int left=0, right=k-1;
    ArrayList<Integer> list=new ArrayList<>();

    while(right < n){
        int count=0;
        HashSet<Integer> set=new HashSet<>();

        for(int i=left;i<=right;i++){
            if(!set.contains(arr[i])){
                count++;
                set.add(arr[i]);
            }
        }

        list.add(count);

        left++;   
        right++;    
    }

    System.out.println(list);
}

}
