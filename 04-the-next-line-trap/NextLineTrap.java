import java.util.Scanner;

public class NextLineTrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your age, your friend's age, and your parent's age: ");
        int yourAge = scanner.nextInt();
        int friendAge = scanner.nextInt();
        int parentAge = scanner.nextInt();

        System.out.println("Ages: You - " + yourAge +", Friend - " +friendAge +", Parent - " + parentAge);

        System.out.print("\nEnter a greeting: ");
        // String greeting = scanner.nextLine(); //the next line trap happens here
        scanner.nextLine();  //throw away a nextline so that it can be wasted on empty spaces to prevent the trap
        String greeting = scanner.nextLine(); //now we can safely read the full line

        System.out.println("Greeting: " + greeting);

        scanner.close();
    }
}
