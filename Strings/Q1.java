import java.util.*;

public class Q1{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    Q1 sol=new Q1();
    String result=sol.solve(str);
    System.out.println(result);
}

public String solve(String str){
char[] arr=str.toCharArray();
int left=0;
int right=arr.length-1;
while(left<right){
    char temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    left++;
    right--;

}

return new String(arr);

}
}