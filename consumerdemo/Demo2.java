package consumerdemo;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String name;
    int sal;
    String gender;

    Employee(String n,int s, String g){
        this.name=n;
        this.sal=s;
        this.gender=g;
    }
}

public class Demo2 {

    public static void main(String[] args){
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("shanid",50000,"male"));
        list.add(new Employee("lulu",60000,"female"));
        list.add(new Employee("jaza",70000,"female"));
        list.add(new Employee("aaban",80000,"male"));
        list.add(new Employee("munnu",90000,"male"));

        Function<Employee,Integer> f = employee -> employee.sal*10/100;

        Predicate<Integer> p = b->b>7000;

        Consumer<Employee> c= employee -> {
            System.out.println(employee.name);
            System.out.println(employee.sal);
            System.out.println(employee.gender);
        };

        for (Employee e:list
             ) {
            int b=f.apply(e);
            if(p.test(b))
            {
                c.accept(e);
            }
        }
    }
}
