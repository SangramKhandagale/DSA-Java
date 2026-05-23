import java.util.*;
public class Q22{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("NOT ROTATION");
        } else {
            String doubled = s1 + s1;  
            if(doubled.contains(s2)){ 
                System.out.println("ROTATION");
            } else {
                System.out.println("NOT ROTATION");
            }
        }
    }
}