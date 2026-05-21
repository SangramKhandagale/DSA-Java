import java.util.*;
public class Q33{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       String p=String.valueOf(n);
        char arr[]=p.toCharArray();
        int sum=0;

        HashMap<Character,Integer> map=new HashMap<>();
int count=1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],count);
            count++;
        }

        for(Map.Entry<Character,Integer> e:map.entrySet()){
         sum=sum+(int)Math.pow(e.getKey()-'0',e.getValue());
        }

        // for(Map.Entry<Character,Integer> e:map.entrySet()){
        //     System.out.println(e.getKey()+" "+e.getValue());
        // }

        if(n==sum){
            System.out.println("Disarium");
        }else{
            System.out.println("Nope");
        }
    }
}