package oops.GetterAndSetter;
import java.util.Arrays;
public class Main {
    
    public static void main(String[] args) {
        String [] spareParts=new String []{"Tires","keys"};
        Car obj= new Car("Nissan",10000,2025,"red",spareParts);

        
        System.out.println(obj.getMake());
        System.out.println(obj.getPrice());
        System.out.println(obj.getYear());
        System.out.println(obj.getColor());

        obj.setPrice(obj.getPrice()/2);
        obj.setColor("black");

        System.out.println();
        System.out.println(obj.getMake());
        System.out.println(obj.getPrice());
        System.out.println(obj.getYear());
        System.out.println(obj.getColor());
        System.out.println(Arrays.toString(obj.getParts()));

        spareParts[0]="cabels";

        Car obj2=new Car("Toyota",2000,2024,"blue",spareParts);
        System.out.println();
        System.out.println(obj2.getMake());
        System.out.println(obj2.getPrice());
        System.out.println(obj2.getYear());
        System.out.println(obj2.getColor());
        System.out.println(Arrays.toString(obj2.getParts()));
    }
}
