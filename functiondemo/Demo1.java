package functiondemo;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args){

        //ex1: squre of a number
        Function<Integer,Integer> f = integer -> integer*integer;
        System.out.println(f.apply(5));
        System.out.println(f.apply(15));
        System.out.println(f.apply(25));
        System.out.println(f.apply(35));

        //length of a string
        Function<String,Integer> f1 = s -> s.length();
        System.out.println(f1.apply("shanid"));




    }


}
