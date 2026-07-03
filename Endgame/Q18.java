import java.util.*;
public class Q18{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int i=0;

while(n!=0){
if(n%3==0){
n=n/3;
i++;
System.out.println(n);
}else if(n%2==0){
n=n/2;
i++;
System.out.println(n);
}else{
n=n-1;
i++;
System.out.println(n);
}
}

System.out.println(i);

}
}