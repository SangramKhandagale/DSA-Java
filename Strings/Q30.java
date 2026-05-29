import java.util.*;
public class Q30{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        String arr[]=new String[n];

        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }

        String new_str="";

     boolean result=true;
    int k=0;
    int count=0;

     while(result==true){
        char ch=arr[0].charAt(k);

        for(int i=0;i<n;i++){
            if(arr[i].charAt(k)==ch){
                continue;
            }else{
              result=false;
                break;
            }
        }


 if (result) {
                new_str = new_str + ch;
                k++;
            }
     }

     System.out.println(new_str);
    }
}