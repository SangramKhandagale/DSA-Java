import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
         int result=countvowel(str);
         System.out.println(result);;

    }

    public static int countvowel(String str){
        int count=0;
        char[] arr=str.toCharArray();
for(int i=0;i<str.length();i++){
    if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||
    arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
        count++;
    }
}return count;
    }
}
