package lamadaIntro;

@FunctionalInterface
interface Cab{
    public void bookCab();
}

/*class Ola implements Cab{
    @Override
    public void bookCab() {
        System.out.println("ola cab is booked........");
    }
}*/

public class Lamdademo1 {

    public static void main(String[] args){
        /*Cab cab = new Ola();
        cab.bookCab();*/

        Cab cab = ()->System.out.println("Ola can is booked.....");
        cab.bookCab();

    }
}
/*
* if we implement lambda here
* we don't need Ola class
* means we don't need to implement Cab using a class
* we can do that directly using lambda function
* for that i am commenting Ola class whole
* and some code in the main method also*/