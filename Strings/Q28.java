import java.util.*;
public class Q28{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
 
        HashMap<String,Integer> map=new HashMap<>();

        String new_str="";
        for(int i=0;i<str.length();i++){
if(str.charAt(i)==' '){
   map.put(new_str, map.getOrDefault(new_str,0)+1);
   new_str="";
}else{
    new_str=new_str+str.charAt(i);
}
}

 map.put(new_str, map.getOrDefault(new_str,0)+1);
    
 for(Map.Entry<String,Integer> e:map.entrySet()){
    System.out.println(e.getKey()+" "+e.getValue());
 }

 String word=in.next();

if(map.containsKey(word)){
     int count=map.get(word);
System.out.println(count);
}else{
    System.out.println(0);
}
 

//  if(count>0){
//     System.out.println(count);
//  }else{
//     System.out.println(0);
//  }
    }
}