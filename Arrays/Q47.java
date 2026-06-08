import java.util.*;

public class Q47 {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }

        for(int i=0;i<n;i++){
            arr2[i]=in.nextInt();
        }

        ArrayList<Integer> diff = new ArrayList<>();
        ArrayList<Integer> prefix = new ArrayList<>();

        prefix.add(0);

        for(int i=0;i<n;i++){
            int num = arr1[i] - arr2[i];
            diff.add(num);
        }

        for(int i=0;i<n;i++){
            int num1 = diff.get(i);
            int num2 = prefix.get(i);

            int sum = num1 + num2;

            prefix.add(sum);
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        int equilibrium = 0;
        long fairStretches = 0;

        for(int x : prefix){

            if(map.containsKey(x)){

                equilibrium++;

                fairStretches += map.get(x);

                map.put(x , map.get(x)+1);
            }
            else{
                map.put(x , 1);
            }
        }

        System.out.println(equilibrium);
        System.out.println(fairStretches);
    }
}