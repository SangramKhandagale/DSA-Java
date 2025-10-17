import java.util.*;
public class Q11{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            
            arr[i]=in.nextInt();
        }

        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();

for(int num:arr){
    if(!seen.add(num)){
        duplicates.add(num);
    }
}
        
     System.out.println(duplicates);

    }
}

