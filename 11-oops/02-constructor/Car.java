package oops.constructor;
public class Car{

    String make;
    double price;
    int year;
    String color;
    String [] parts;

    Car(){  //default constructor
        System.out.println("default constructor");
    }

    public Car(String make,double price, int year, String color){ //Parameterized constructor
        this.make=make; //this keyword refers to the current object
        this.price=price; //this keyword is used to distinguish between parameters and fields 
        this.year=year;
        this.color=color;
    }

    public Car(Car obj){ //copy constructor
        this.make=obj.make; 
        this.price=obj.price; 
        this.year=obj.year;
        this.color=obj.color;
    }

}
