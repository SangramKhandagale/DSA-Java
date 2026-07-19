package Endgame;
import java.util.*;
public class Q66{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        int M=1000,CM=900,D=500,CD=400,C=100,XC=90,L=50,XL=40,X=10,IX=9,V=5,IV=4,I=1;
        String str="";

        while(n!=0){
            if(n>=1000){
                n=n-M;
                str=str+"M";
            }else if(n>=900 && n<1000){
                n=n-CM;
                str=str+"CM";
            }else if(n>=500 && n<900){
                n=n-D;
                str=str+"D";
            }else if(n>=400 && n<500){
                n=n-CD;
                str=str+"CD";
            }else if(n>=100 && n<400){
                n=n-C;
                str=str+"C";
            }else if(n>=90 && n<100){
                n=n-XC;
                str=str+"XC";
            }else if(n>=50 && n<90){
                n=n-L;
                str=str+"L";
        }else if(n>=40 && n<50){
                n=n-XL;
                str=str+"XL";
        }else if(n>=10 && n<40){
                n=n-X;
                str=str+"X";
        }else if(n==9){
                n=n-IX;
                str=str+"IX";
        }else if(n>=5 && n<9){
                n=n-V;
                str=str+"V";
        }else if(n==4){
            n=n-IV;
            str=str+"IV";
        }else if(n>=1 && n<4){
            n=n-I;
            str=str+"I";
        }
    }

    System.out.println(str);
}}