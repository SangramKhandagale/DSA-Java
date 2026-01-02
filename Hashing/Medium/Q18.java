package Hashing.Medium;
import java.util.*;
public class Q18{
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         in.nextLine();
         String arr[]=new String[n];
         for(int i=0;i<n;i++){
            arr[i]=in.nextLine();
         }

         HashMap<String,Integer> map=new HashMap<>();

         for(int i=0;i<n;i++){
            int len=arr[i].length();
            map.put(arr[i],len);
         }

         for(Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
         }

         int k=in.nextInt();
         in.nextLine();

        for(int i=0;i<k;i++){
            String maxstr="";
            int maxlen=0;
        for(Map.Entry<String,Integer> e:map.entrySet()){
           if(e.getValue()>maxlen){
            maxlen=e.getValue();
            maxstr=e.getKey();
           }
         }

         System.out.println(maxstr+" "+maxlen);
         map.remove(maxstr);
        }
    }

}