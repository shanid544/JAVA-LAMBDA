package predicatedemo;

import java.util.ArrayList;
import java.util.function.Predicate;
class Employee{
    String ename;
    int sal;
    int exp;

    Employee (String name, int salary, int experience){
        this.ename=name;
        this.sal=salary;
        this.exp=experience;
    }
}
class Demo2 {

    public static void main(String[] args){

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("shanid",70000,3));
        al.add(new Employee("thanveer",60000,2));
        al.add(new Employee("jaza",30000,4));
        al.add(new Employee("aaban",20000,1));
        al.add(new Employee("lulu",10000,7));
/*

        Predicate<Employee> p = employee -> employee.sal>50000;
        for (Employee e:al) {
            if(p.test(e)){
                System.out.println(e.ename);
            }
        }
*/

        /*

        Predicate<Employee> p = (employee -> employee.sal>50000 && employee.exp>2);
        for (Employee e:al) {
            if(p.test(e)){
                System.out.println(e.ename);
            }
        }
*/

        al.forEach(employee -> {
            if(employee.sal>50000) {
                System.out.println(employee.ename);
            }
        });

        al.forEach(employee -> {
            if(employee.sal>50000 && employee.exp>2) {
                System.out.println(employee.ename);
            }
        });
    }
}
