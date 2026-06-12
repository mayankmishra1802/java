public class Variables {
    public static void main(String[] args) {
        int passengers=5;               //variable initialization //lowerCamelCase
        System.out.println(passengers);

        int busTickets=passengers;  
        System.out.println(busTickets);

        passengers=passengers+2;  //updating variable value
        System.out.println(passengers);
        passengers+=2;            //shorthand operator
        System.out.println(passengers);

        int year=2010;
        String winner="spain";  //String data type

        String announcement="The world cup winner in "+year+" is "+winner; //String concatenation
        System.out.println(announcement);

        char Letter='A';  //single character
        System.out.println("Letter is "+Letter); 

        //int globalPopulation=8000000000; // out of range for int
        long globalPopulation=8_000_000_000L; //L tells compiler that this is long value
        //underscore(_) for better readability
        System.out.println("Global Population is "+globalPopulation);

        double percentage=65.5; //decimal values
        System.out.println("Percentage is "+percentage);

    }
}
