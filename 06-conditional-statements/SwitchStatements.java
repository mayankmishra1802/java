public class SwitchStatements {
    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("Wear sunglasses and a hat.");
                break;
            case "cloudy":
                System.out.println("Wear a light jacket.");
                break;
            case "rainy":
                System.out.println("Wear a raincoat and boots.");
                break;
            case "snowy":
                System.out.println("Wear a heavy coat and gloves.");
                break;
            default:
                System.out.println("Wear comfortable clothes for any weather.");
        }        
    }

}
