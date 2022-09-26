package home.leetcode.problem;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstElement {

    public static void main(String[] args) {

        IntStream str= Arrays.stream(new int [] {1,2,3,4});
        // 1st way
        System.out.println(str.reduce((a,b)-> a).getAsInt());
        // 2nd way
        IntStream str1= Arrays.stream(new int [] {1,2,3,4});
        System.out.println(str1.findFirst().getAsInt());
    }
}
