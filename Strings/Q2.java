import java.util.*;;
public class Q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Q2 sol=new Q2();
        String result=sol.solve(str);
        System.out.println(result);

    }

    public String solve(String str){
if(str==null || str.length()<=1){
    return str;
}else{
    return str.charAt(str.length()-1)+solve(str.substring(0,str.length()-1));
}
    }
}
