package consumerdemo;

import java.util.function.Consumer;

//consumer chaining
public class Demo3 {

    public static void main(String[] args){
        Consumer<String> c = s -> System.out.println(s+" is white");
        Consumer<String> c1 = s -> System.out.println(s+" is an animal");
        Consumer<String> c2 = s -> System.out.println(s+" gives milk");

        c.accept("cow");
        c1.accept("cow");
        c2.accept("cow");

        c.andThen(c1).andThen(c2).accept("cow");

        Consumer<String> c4 = c.andThen(c1).andThen(c2).andThen(c2);
        c4.accept("cow");
    }
}
