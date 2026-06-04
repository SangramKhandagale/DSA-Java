import java.util.*;
public class Q44{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

int sum=0;
for(int i=1;i<=n;i++){
if(n%i==0){
System.out.print(i+" ");
sum=sum+i;
}

}

System.out.print(sum);
}
}