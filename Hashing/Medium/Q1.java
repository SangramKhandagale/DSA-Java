package Hashing.Medium;

import java.util.HashSet;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int right =0,left=0,maxLen=0,bestStart=0;
        HashSet<Character> set=new HashSet<>();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));

                if(right-left+1>maxLen){
                    maxLen=right-left+1;
                    bestStart=left;
                }
                right++;

            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }

          System.out.println(maxLen);
          System.out.println(s.substring(bestStart, bestStart+maxLen));

    }
}
