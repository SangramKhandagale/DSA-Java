import java.util.*;

public class Q17 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr1 = new int[n];

         int m= in.nextInt();
        int[] arr2 = new int[m];

        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

           for(int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();


         for(int i = 0; i < n; i++) {
           set1.add(arr1[i]);
        }

         for(int i = 0; i < m; i++) {
           set2.add(arr2[i]);
        }

        System.out.println(set1);
        System.out.println(set2);

        for(int i=0;i<n;i++){
            if(set2.contains(arr1[i])){
                set3.add(arr1[i]);
            }
        }

        System.out.println(set3);
       

    }
}