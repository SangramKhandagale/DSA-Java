import java.util.*;
public class Q32{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String n1=in.nextLine();
        char arr[]=n1.toCharArray();

        HashSet<Integer> set=new HashSet<>();
        boolean result=true;

        for(int i=0;i<arr.length-1;i++){
        int j=arr[i];
        int k=arr[i+1];

        int sum=Math.abs((j-'0')-(k-'0'));

        if(set.isEmpty()){
            set.add(sum);
        }else if(!set.contains(sum)){
            result=false;
        }
        }

        System.out.println(result);

    }
}