public class LogicalOperators {
    public static void main(String[] args) {

        boolean hasDrivingLicense = true;
        boolean hasInsurance = true;

        if (hasInsurance && hasDrivingLicense) {
            System.out.println("You can legally drive.");
        } 
        else {
            System.out.println("You cannot legally drive.");
            
        }

        int age = 25;
        double income = 45000;

        if (age >= 21 && income >= 40000) {
            System.out.println("You are eligible for a loan.");
        } 
        else {
            System.out.println("You are not eligible for a loan.");
            
        }


        String inputUsername = "JohnDoe";
        String inputPassword = "password123";

        String correctUsername = "JohnDoe";
        String correctPassword = "password123";

        if (inputUsername.equals(correctUsername) && inputPassword.equals(correctPassword)) {
            System.out.println("Access granted.");
        } 
        else {
            System.out.println("Access denied.");
            
        }

        boolean hasGoodPerformance = true;
        boolean isLongTermEmployee = false;
        if (hasGoodPerformance || isLongTermEmployee) {
            System.out.println("You are eligible for a bonus.");
        } 
        else {
            System.out.println("You are not eligible for a bonus.");
            
        }

        int userAge = 17;
        boolean isParentPresent = true;

        if (userAge >= 18 || isParentPresent) {
            System.out.println("The user can watch the movie.");
        } 
        else {
            System.out.println("The user cannot watch the movie.");
            
        }


        int memberAge = 16;
        boolean hasMembership = false;

        if (memberAge < 18 || hasMembership) {
            System.out.println("The member can enter the amusement park.");
        } 
        else {
            System.out.println("The member cannot enter the amusement park.");
            
        }

        String option = "cash";

        boolean cashOrCredit = option.equals("cash") || option.equals("credit");
        if (cashOrCredit) {
            System.out.println("Payment accepted.");
        } 
        else {
            System.out.println("Payment method not accepted.");
            
        }

        char letter = 'A';

        boolean isVowel = (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U');
        if (isVowel) {
            System.out.println(letter + " is a vowel.");
        } 
        else {
            System.out.println(letter + " is not a vowel.");
            
        }

        String move = "stay";
        boolean isHitOrStay = move.equals("hit") || move.equals("stay");
        if (isHitOrStay) {
            System.out.println("Valid move.");
        } 
        else {
            System.out.println("Invalid move.");
        }
    }
}
