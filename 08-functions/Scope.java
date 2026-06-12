public class Scope {
    static double length=5; //global variable (class variable) that can be accessed by all methods in the class
    static double width=3;
    public static void main(String[] args) {
        System.out.println("Area: " + area());
    }

    public static double area(){
        double area = length * width; // local variable to store the area
        return area; // return statement
    }
    
}
