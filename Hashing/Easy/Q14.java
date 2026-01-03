package Hashing.Easy;
import java.util.*;
public class Q14{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       System.out.println("Enter size of array:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elemnets:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("Enter target:");
        int target=in.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0 )+1);
    }

    ArrayList<Integer> list=new ArrayList<>();

    for(Map.Entry<Integer,Integer> e:map.entrySet()){
        System.out.println(e.getKey()+" "+e.getValue());
    }

    for(Map.Entry<Integer,Integer> e:map.entrySet()){
        if(e.getValue()>1){
            int tar=e.getKey();
          for(int i=0;i<n;i++){
            if(arr[i]==tar){
                list.add(i);
            }
          }
        }
    }

    boolean result=false;
    for(int i=0;i<list.size()-1;i++){
       if((list.get(i+1)-list.get(i))<=target){
        result=true;
        break;
       }
    }

    System.out.println(list);

    System.out.println(result);
    }

  
    
}