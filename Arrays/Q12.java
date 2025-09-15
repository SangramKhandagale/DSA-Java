import java.util.*;
public class Q12{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        HashSet<Integer> seen=new HashSet<>();
        ArrayList<int[]> pairs=new ArrayList<>();
        
        System.out.println("Enter target:");
        int target=in.nextInt();

        for(int x:arr){
            int complement=target-x;
            if(seen.contains(complement)){
                pairs.add(new int[]{x,complement});
            }
            seen.add(x);
        }

        for(int[] x:pairs){
           System.out.println(x[0]+" "+x[1]);
        }
    }
}