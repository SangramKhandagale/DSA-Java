package Endgame;
import java.util.*;

public class Q54 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        HashSet<Integer> registered = new HashSet<>();

        for(int i=0;i<n;i++){
            registered.add(in.nextInt());
        }

        int m = in.nextInt();

        HashSet<Integer> active = new HashSet<>();
        HashSet<Integer> blocked = new HashSet<>();

        int checked = 0;

        for(int i=0;i<m;i++){

            String operation = in.next();
            int vendorId = in.nextInt();

            if(operation.equals("Entry")){

                if(registered.contains(vendorId)){
                    active.add(vendorId);
                }else{
                    blocked.add(vendorId);
                }

            }else if(operation.equals("Check")){

                checked++;

            }else if(operation.equals("Exit")){

                active.remove(vendorId);

            }
        }

        System.out.println("Active = " + active.size());
        System.out.println("Blocked = " + blocked.size());
        System.out.println("Checked = " + checked);
    }
}