public class Functions {

    public static void main(String[] args) { //main() is static because it needs to be called by the Java runtime without creating an instance of the class
        //public keyword is used to indicate that the method can be accessed from outside the class.

        hello();  // function call

        calculateArea(5, 3); // function call with arguments

        int area = areaCalculation(5, 3); // function call with arguments and storing the return value in a variable
        System.out.println("Area:" + area);

        areaCal(-5,3); 

    }

    public static void hello(){ // function definition 
        //static keyword is used to indicate that the method belongs to the class rather than an instance of the class. 
        // This allows us to call the method without creating an object of the class.

        //public keyword is used to indicate that the method can be accessed from outside the class.
        System.out.println("Hello, this is a function");
    }

    public static void calculateArea(int length, int width){ // function definition with parameters 
        System.out.println("Area: " + (length * width));
    }

    public static int areaCalculation(int length, int width){ // function definition with parameters and return type
        int area= length * width; // local variable to store the area
        return area; // return statement 
    }

    public static void areaCal(int length,int width){ 
        if(length < 0 || width < 0){ 
            System.out.println("not valid dimensions");
            System.exit(0); // exit the program if the dimensions are not valid
        } 
        int area = length * width;
        System.out.println("Area: " + area);
    }
}
