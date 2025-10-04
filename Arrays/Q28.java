import java.util.*;
public class Q28{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
         arr[i]=in.nextLine();
        }

        String k=in.nextLine();
        

        for(int j=0;j<n;j++){
            int count=0;
            for(int i=0;i<k.length();i++){
                if(arr[j].charAt(i)==k.charAt(i)){
                    count++;
                }
            }

            
            if(count==k.length()){
                System.out.println(arr[j]);
            }
        }
    }
}