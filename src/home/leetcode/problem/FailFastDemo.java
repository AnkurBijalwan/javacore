package home.leetcode.problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastDemo {

    List<String> dataSet=new ArrayList<>();

    public static void main(String[] args) {
        FailFastDemo ffd= new FailFastDemo();
        ffd.dataSet.add("1");ffd.dataSet.add("2");ffd.dataSet.add("3");ffd.dataSet.add("4");

        Iterator<String> it= ffd.dataSet.iterator();
        String word="",rev="";
        String a="I am good ";

        for(int i=0;i<a.length();i++){
            if(a.charAt(i) != ' '){
                word=word+a.charAt(i);
            }else{
                rev=word+" "+rev;
                word="";
            }
        }

        System.out.println(rev);

    }

}
