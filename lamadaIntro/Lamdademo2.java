package lamadaIntro;

@FunctionalInterface
interface Cab2{
    public void bookCab(String s, String d);
}

public class Lamdademo2 {

    public static void main(String[] args){

        Cab2 cab = (source,destination)->System.out.println("Ola cab is booked from "+source+" to "+destination);
        cab.bookCab("kerala","Goa");

    }
}
