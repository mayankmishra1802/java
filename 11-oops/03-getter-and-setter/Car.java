package oops.GetterAndSetter;
import java.util.Arrays;

public class Car{
    
    private String make;
    private double price;
    private int year;
    private String color;
    private String [] parts;  //arrays are mutable objects 

    public Car(String make,double price, int year, String color, String [] parts){ 
        this.make=make; 
        this.price=price; 
        this.year=year;
        this.color=color;
        //this.parts=parts will store reference of array which will be shared by all the objects
        //this.parts=parts //shallow copy=same reference share kr rhe h
        this.parts=Arrays.copyOf(parts,parts.length);  //it will create unique reference for array of each object 
        //deep copy=same reference share nhi krte ,actual data copy hota h 
    }


    public void setMake(String make) { //setter method is used to the set/update the value of a field
        this.make = make;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setParts(String[] parts){
        this.parts=Arrays.copyOf(parts,parts.length); //store unique reference 
    }
    

    public String getMake() { //getter method is used to the retrieve the value of a field
        return make;
    }
    public double getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String[] getParts(){
        return Arrays.copyOf(this.parts,this.parts.length); //creating copy of this.parts and returning uniu=que reference
    }

}
