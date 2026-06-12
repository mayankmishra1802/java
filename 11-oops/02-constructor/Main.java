package oops.constructor;
public class Main {
    
    public static void main(String[] args) {

        Car obj=new Car(); //default contructor will be called

        obj.make="maruti";
        obj.price=25000;
        obj.year=2026;
        obj.color="black";

        System.out.println();
        System.out.println(obj.make);
        System.out.println(obj.price);
        System.out.println(obj.year);
        System.out.println(obj.color);
        
        Car obj1= new Car("Nissan",10000,2025,"red"); //parameterized constructor
        
        System.out.println();
        System.out.println(obj1.make);
        System.out.println(obj1.price);
        System.out.println(obj1.year);
        System.out.println(obj1.color);

        Car obj2=obj1; //obj1 and obj2 will point to the same object reference
        //we can update the fields of the same object using obj1 or obj2

        System.out.println();
        System.out.println(obj2.make);
        System.out.println(obj2.price);
        System.out.println(obj2.year);
        System.out.println(obj2.color);
        
        Car obj3=new Car(obj1); //copy constructer used instead of obj2=obj1 //obj3 will store unique reference

        System.out.println();
        System.out.println(obj3.make);
        System.out.println(obj3.price);
        System.out.println(obj3.year);
        System.out.println(obj3.color);

    }
}
