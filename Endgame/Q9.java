import java.util.*;
public class Q9{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
if(n%2==1 || n==0){
System.out.println("No");
}

int i=-1;

if(n%2==0 && n!=0){
while(n!=0){
n=n/2;
i++;
}

System.out.println("Yes "+i);
}

}
}