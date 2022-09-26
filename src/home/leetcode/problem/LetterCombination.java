package home.leetcode.problem;

import java.util.*;
import java.util.stream.Collectors;

public class LetterCombination {

    public static void main(String[] args) {
       /* LetterCombination lc=new LetterCombination();
        int n=5;

        for(int i=0;i<5;i++){

        }
        System.out.println(new Date().getTime());
        //System.out.println(lc.fiboRec(50));
        System.out.println(new Date().getTime());
        System.out.println("============");
        System.out.println(new Date().getTime());
        System.out.println(lc.fibo(50));
        System.out.println(new Date().getTime());*/

        String str="aab";
        String sam="";
        int len=0;
        int oldlen=0;
        for(int i=0;i<str.length();i++){
            if(sam.contains(str.charAt(i)+"")){
                if(oldlen < len) {
                    oldlen = len;
                    len = 0;
                    sam="";
                }
            }else{
                sam=sam+str.charAt(i);
                len++;
            }
        }

        System.out.println(oldlen>len ? oldlen:len);
    }

    int fiboRec(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

          return fiboRec(n-1)+ fiboRec(n-2);
    }

    long fibo(int n){

        long sum=1,a=1,b=1;
        for(int i=1;i<n-1;i++){
            sum =a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
    }
