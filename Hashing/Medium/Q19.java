package Hashing.Medium;
import java.util.*;
public class Q19{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        in.nextLine();
        String arr1[]=new String[n];
        String arr2[]=new String[m];

        for(int i=0;i<n;i++){
            arr1[i]=in.nextLine();
        }

         for(int i=0;i<m;i++){
            arr2[i]=in.nextLine();
        }

        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();

        for(int i=0;i<n;i++){
            map1.put(arr1[i],i);
        }

         for(int i=0;i<m;i++){
            map2.put(arr2[i],i);
        }

        for(Map.Entry<String,Integer> e:map1.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

           for(Map.Entry<String,Integer> e:map2.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

        int minsum=Integer.MAX_VALUE;
        String str="";
         for(Map.Entry<String,Integer> e:map1.entrySet()){
           if(map2.containsKey(e.getKey())){
          int sum=e.getValue()+map2.get(e.getKey());

          if(sum<minsum){
            minsum=sum;
            str=e.getKey();
          }

           }
        }
     
        System.out.println(str+" "+minsum);
        
    }
}