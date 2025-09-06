import java.util.*;
public class Q11{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] arr=str.toCharArray();
        permute(arr,0);

    }

    public static void permute(char arr[],int index ){
     
        if(index==arr.length){
            System.out.println(arr);
        }

        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            permute(arr,index+1);
            swap(arr,i,index);
        }
    }

    public static void swap(char[] arr,int i,int index){
        char temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
}