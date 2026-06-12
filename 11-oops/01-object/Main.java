package oops.object;
public class Main {
    
    public static void main(String[] args) {
        Car obj1= new Car(); //object creation
        
        obj1.make="Nissan";
        obj1.price=10000;
        obj1.year=2025;
        obj1.color="red";

        Car obj2=new Car();

        obj2.make="maruti";
        obj2.price=25000;
        obj2.year=2026;
        obj2.color="black";

        System.out.println(obj1.make);
        System.out.println(obj1.price);
        System.out.println(obj1.year);
        System.out.println(obj1.color);

        System.out.println(obj2.make);
        System.out.println(obj2.price);
        System.out.println(obj2.year);
        System.out.println(obj2.color);

    }
}
