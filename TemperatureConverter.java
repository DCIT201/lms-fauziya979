import java.util.scanner;

public class TemperatureConverter {
    public static void main(string[] args) {

    // create a scanner object for user input
    Scanner scanner = new scanner(system.in);
    
    // Display options to the user
    system.out.printIn("Temperature converter");
    system.out.printIn("Choose an option:");
    system.out.printIn("1. Convert Celsius to Fahrenheit");
    system.out.printIn("2. Convert Fahrenheit to Celsius");

    // Get user's choice and validate input
    int choice = 0;
    boolean validChoice = false;


    while (!validChoice) { 
        system.out.print("Enter 1 or 2: ");
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            if (choice == 1 || choice == 2) {
                validChoice = true;
            } else {
                system.out.printIn("Invalid choice! please enter 1 or 2. ");
            }
        } else  { 
            system.out.printIn("Invalid input! please enter a valid number.");
            scanner.next(); // clear invalid input

        }

    }
    // process the conversion based on user's choice
    if (choice == 1) {
        // convert Celsius to Fahrenheit
        system.out.print("Enter temperature in celsius: ");
        double celsius = getValidTemperatureInput(scanner);

        double Fahrenheit = (celsius * 9/5) + 32;
        system.out.printf(" %.2f Celsius is %.2f  Fahrenheit.\n", celsius, fahrenheit);
    } else if (choice == 2){  
        // convert Fahrenheight to celsius
        system.out.print("Enter temperature in Farenheight: ");
        double fahrenheit = getValidTempeartureInput (scanner);


        double celsius = (fahrenheit - 32) * 5/9;
        system.ot.printf("%.2f Fahrenheit is %.2f Celsius.\n", fahrenheight, celsius);
    }

    // close the scanner
    scanner.close();


    }
    

    // Method to get valid temperature input
    private static double getValidTemperatureInput(Scanner scanner) {
        double temperature = 0;
        boolean validInput = false;
        while (!validInput){
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                validInput = true;
            } else {
               system.out.printIn("Invalid temperature input! please enter a valid number") ;
               scanner.next(); //clear invalid input

            }
        }
        return temperature;
    }
}
    
    
    

































