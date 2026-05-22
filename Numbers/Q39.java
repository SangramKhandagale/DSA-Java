import java.util.*;
public class Q39{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        String str1=String.valueOf(n1);

        int n2=2*n1;
        String str2=String.valueOf(n2);

        int n3=3*n1;
        String str3=String.valueOf(n3);

        HashSet<Integer> set=new HashSet<>();
    
        String str=str1+str2+str3;

        System.out.println(str);

        for(int i=1;i<=9;i++){
            set.add(i);
        }

        for(int i=0;i<str.length();i++){
            if(set.contains(str.charAt(i)-'0')){
                set.remove(str.charAt(i)-'0');
            }
        }

        if(set.isEmpty()){
            System.out.println("Fascinating");
        }else{
            System.out.println("Nope");
        }
    }
}