public class DocCommets {
    public static void main(String[] args) {
    }

    /**   // This is a documentation comment for the hello() function
     * Function name: hello
     * Inside the function:
     *  1. Prints : 'Hello, this is a function'
     */
    public static void hello(){ 
        System.out.println("Hello, this is a function");
    }
    /**
     * Function name: printText
     * @param name (String) 
     * @param age (String)
     * 
     * 
     * Inside the function:
     * 1. Prints the name and age as part of the text
     */
    public static void printText(String name, String age){ 
        System.out.println("Hi I am " + name + " and I am " + age + " years old");
    }

    /**
     * Function name: calculateArea
     * 
     * @param length (double)
     * @param width  (double)
     * @return       (double)
     * 
     * 
     * Inside the function:
     * 1. Calculates the area by multiplying length and width
     * 2. Returns the calculated area
     */
    public static double calculateArea(double length, double width){ 
        double area = length * width; 
        return area; 
    }
    
}
