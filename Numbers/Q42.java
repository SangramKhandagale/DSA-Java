import java.util.*;
public class Q42{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String n1=String.valueOf(n);
        String n2=new StringBuilder(n1).reverse().toString();
        int num=Integer.parseInt(n2);

int count=0;
int count1=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
}
        }
         for(int i=2;i<n;i++){
            if(num%i==0){
                count1++;
}
        }

        
        if(count==0 && count1==0){
            if(n!=num){
                System.out.println("Emirp");
            }else{
                System.out.println("Nope");
            }
        }else{
    System.out.println("Nope");
        }


    }
}