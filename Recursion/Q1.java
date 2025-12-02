package Recursion;

import java.util.*;
public class Q1{
    public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
String name="Venom";
Name(n,name);

    }

    public static void Name(int n,String name){
if(n==1){
  System.out.println(name);
}else{
   System.out.println(name);
   Name(n-1,name);
}

    }
}