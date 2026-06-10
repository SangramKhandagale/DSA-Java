import java.util.*;
public class Q52{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int disputed=0,murugan=0,pierre=0,disputed_sum=0;

int left=0,right=n-1;

while(left<right){
int sum=arr[left]+arr[right];

if(sum==t){
disputed++;
disputed_sum=disputed_sum+sum;
}else if(sum>t){
    murugan++;
}else if(sum<t){
    pierre++;
}

left++;
right--;

}

System.out.println(murugan+" "+pierre+" "+disputed+" "+disputed_sum);

    }
}