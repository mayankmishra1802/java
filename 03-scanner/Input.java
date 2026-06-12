import java.util.Scanner; //importing the Scanner class

public class Input {
    public static void main(String[] args) {

        System.out.println("Welcome. Thank you for taking the survey");

        Scanner scanner = new Scanner(System.in); //Creating a Scanner object //used for taking input from user
        int counter = 0;

        System.out.println("What is your name?");
        String name =scanner.nextLine(); //for text input
        counter+=1;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice =scanner.nextDouble();  //for double input
        counter+=1;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice= scanner.nextDouble();
        counter+=1;

        System.out.println("How many times a week do you buy coffee?");
        int coffeeAmount= scanner.nextInt(); // for integer input
        counter+=1;

        System.out.println("How many times a week do you buy fast food?");
        int foodAmount= scanner.nextInt();
        counter+=1;

        scanner.close(); //closing the scanner object to prevent resocurce leak

        System.out.println("Thank you "+name+" for answering all "+counter +" questions");
        System.out.println("Weekly, you spend $"+(coffeePrice*coffeeAmount) +" on coffee");
        System.out.println("Weekly, you spend $"+(foodPrice*foodAmount) +" on food");

    }
}
