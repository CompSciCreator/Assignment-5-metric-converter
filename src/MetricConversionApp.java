
import java.util.Scanner;
public class MetricConversionApp {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice; 

        System.out.println("Welcome to the Metric Converter App!");
       

        do {
            displayMenu();
            choice = scanner.nextLine();
            handleConversion(choice);
        } while (!choice.equalsIgnoreCase("exit"));

        System.out.println("Exiting the Metric Converter App. Goodbye!");
        scanner.close();
    }

    public static void displayMenu() {

        System.out.println("Choose a conversion option:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Grams to Ounces");
        System.out.println("3. Kilometers to Miles");
        System.out.println("4. Millimeters to Inches");
        System.out.println("Type 'exit' to quit.");
        

    }

           
    public static void handleConversion(String choice) {
        double result;
        Scanner scanner = new Scanner(System.in);

        switch (choice) {
            case "1" :
                System.out.println("Enter the weight in kilograms: ");
                double kilograms = scanner.nextDouble();
                result = convertKilogramsToPounds(kilograms);
                System.out.println("Result: " + result + " pounds");
                break;
            case "2" : 
                System.out.println("Enter the weight in grams: ");
                double grams = scanner.nextDouble();
                result = convertGramsToOunces(grams);
                System.out.println("Result: " + result + " ounces");
                break; 
            case "3" : 
                System.out.println("Emter the distance in kilometers: ");
                double kilometers = scanner.nextDouble();
                result = convertKilometersToMiles(kilometers);
                System.out.println("Result: " + result + " miles");
                break;
            case "4" :
                System.out.println("Enter the measurement in millimeters: ");
                double millimeters = scanner.nextDouble();
                result = convertMillimetersToInches(millimeters);
                System.out.println("Result: " + result+ " inches");
                break;
            case "exit":
                break;
            default:
                System.out.println("Invalid Choice. Please try again.");
                scanner.close();
        }
    
    }
    public static double convertKilogramsToPounds(double kilograms) {

        // Conversion factor: 1 kilogram = 2.20462 pounds

        return kilograms * 2.20462;

    }

    public static double convertGramsToOunces(double grams) {

        // Conversion factor: 1 gram = 0.03527396 ounces

        return grams * 0.03527396;

    }

    public static double convertKilometersToMiles(double kilometers) {

        // Conversion factor: 1 kilometer = 0.621371 miles

        return kilometers * 0.621371;

    }

    public static double convertMillimetersToInches(double millimeters) {

        // Conversion factor: 1 millimeter = 0.0393701 inches

        return millimeters * 0.0393701;

    }










}

 








            
        
        




