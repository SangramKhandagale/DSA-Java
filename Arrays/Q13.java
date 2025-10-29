import java.util.*;
public class Q13{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of array 1:");
        int n=in.nextInt();
        System.out.println("Enter size of array 2:");
         int m=in.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter array 1:");
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }

        System.out.println("Enter array 2:");
          int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=in.nextInt();
        }

        HashSet<Integer> set1=new HashSet<>();
         HashSet<Integer> set2=new HashSet<>();

        for(int x:arr1){
            set1.add(x);
        }

        for(int b:arr2){
            if(set1.contains(b)){
                set2.add(b);
            }
        }

        System.out.println(set2);
    }
}
