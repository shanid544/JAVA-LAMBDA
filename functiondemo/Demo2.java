package functiondemo;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int salary;

    Employee(String ename, int eslary){
        this.name=ename;
        this.salary=eslary;
    }
}

public class Demo2 {

    public static void main(String[] args){
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("shanid",50000));
        al.add(new Employee("jaza",10000));
        al.add(new Employee("munnu",20000));
        al.add(new Employee("aaban",30000));
        al.add(new Employee("lulu",40000));

        Function<Employee,Integer> fn = e -> {
            int s=e.salary;
            if(s>=10000 && s<=20000)
                return s*10/100;
            else if(s>20000 && s<=30000)
                return s*20/100;
            else if(s>30000 && s<=40000)
                return s*30/100;
            else
                return s*40/100;
        };

        Predicate<Integer> p = integer -> integer>5000;

        for (Employee e:al
             ) {
            int bonus = fn.apply(e);
            if(p.test(bonus)) {
                System.out.println(e.name + " " + e.salary);
                System.out.println("Bonus is " + bonus);
            }
        }

    }



}
