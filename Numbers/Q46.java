import java.util.*;
public class Q46{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int sum=0;
int counting=0;

for(int i=1;i<=n;i++){
int count=0;
for(int j=1;j<=n;j++){
if(i%j==0){
count++;
}
}

if(count%2==1){
counting++;
sum=sum+i;
}

}

System.out.print(counting+" "+sum);

}
}