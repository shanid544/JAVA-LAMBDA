package predicatedemo;

import java.util.function.Predicate;

//Joining predicates
//and, or, negate
public class Demo3 {

    public static void main(String[] args){

        Predicate<Integer> p1 = integer -> integer%2==0;
        Predicate<Integer> p2 = integer -> integer>50;

        int[] a={10,20,30,40,50,60,70,80,90,99,88,77,66,55,33,11};

        //and
        for (int j:a
             ) {
           //if(p1.test(j) && p2.test(j)){  - this also we can do
           if(p1.and(p2).test(j)){  ////if(p1.test(j) && p2.test(j))
              System.out.println(j);
           }
        }
        System.out.println("===========");

        //or
        for (int j:a
        ) {
            //if(p1.test(j) || p2.test(j)){
           if(p1.or(p2).test(j)){  ////if(p1.test(j) || p2.test(j))
                System.out.println(j);
            }
        }
        System.out.println("===========");

        //negate
        for (int j:a
        ) {

            if(p1.negate().test(j)){
                System.out.println(j);
            }
        }
        System.out.println("===========");



    }
}
