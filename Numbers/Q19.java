import java.util.*;
public class Q19{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] arr=str.toCharArray();
        int sum1=0,sum2=0;

        for(int i=0;i<(arr.length/2);i++){
            sum1=(arr[i]-'0')+sum1;
        }

        for(int i=arr.length-1;i>=(arr.length/2);i--){
            sum2=(arr[i]-'0')+sum2;
        }
        
        if(sum1==sum2){
            System.out.println("Lucky");
        }else{
            System.out.println("Not lucky");
        }
    }
}