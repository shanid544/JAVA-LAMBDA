package predicatedemo;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args){

        //example1: check the given integer is grater than 10
        Predicate<Integer> p = i ->  i>10;
        System.out.println(p.test(9));//false
        System.out.println(p.test(13));//true

        //example2: check the given string's length is grater than 4
        Predicate<String> ps = s -> s.length()>4;
        System.out.println(ps.test("shanid"));//true
        System.out.println(ps.test("sha"));//false

        //example3: print the array element whose length is grater than 4
        String[] names = {"tom","jerry","aaban","june","jaza","hafeefa","thanveer"};

        for (String name:names) {
            if(ps.test(name)){
                System.out.println(name+" is bigger name");
            }

        }



    }
}
/*what is the advatage of using lambda?
*
* we can do the above example without lambda also
* for (String name:names) {
            if(name.length()>4){
                System.out.println(name+" is bigger name");
            }

        }
 *but if we have lots of conditions we do not need to add that into if
 * insetad we can create one predicate with lost of condition */