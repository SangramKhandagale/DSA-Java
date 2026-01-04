import java.util.*;
public class Solution{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int max=0;
int pack=0;
for(int i=1;i<=n;i++){
int new_max=n%i;
if(new_max>max){
max=new_max;
pack=i;
}
}

if(pack==0){
    System.out.println(n);
}else{
    System.out.println(pack);
}
}
}