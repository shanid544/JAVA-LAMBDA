package supplierdemo;

import java.util.Date;
import java.util.function.Supplier;

public class demo1 {

    public static void main(String[] args){
        Supplier<Date> s= ()->new Date();
        System.out.println(s.get());
    }
}
