import java.util.Scanner;

/**
 * This class implements a simple periodic table lookup for common elements
 * It allows users to input the name of an element and choose either to return its mass or charge from further input.
 * Begin by Compiling and Executing in Terminal
 */
public class periodicTable {
    public static void main(String[] args) {
        // Scanner to pass in an input
        Scanner scr_scanner = new Scanner(System.in);
        // Variable to be updated if the input is a word in the below array
        boolean conditionalVar;
        
        // Array containing the names of elements in the periodic table
        String[] elementNameList = {
            "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen",
            "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium", "Aluminum", "Silicon",
            "Phosphorus", "Sulfur", "Chlorine", "Argon", "Potassium", "Calcium"
        };

        // primary program loop
        while (true) {
            System.out.println("Enter the name of one element: ");
            String input = scr_scanner.nextLine();
            conditionalVar = false;

            // Look through the elementList Array for a match
            for (int i = 0; i < elementNameList.length; i++) {
                if (elementNameList[i].equalsIgnoreCase(input)) {
                    System.out.println("Element found: " + elementNameList[i]);
                    System.out.println("Do you want the mass (m) or charge (c)?");
                    char choice = scr_scanner.nextLine().charAt(0);
                    conditionalVar = true;

                    // Switch Statement to handle user input logic
                    switch (choice) {
                        case 'm':
                            double mass = getMass(elementNameList[i]);
                            if (mass != 0) {
                                System.out.println("The mass of " + elementNameList[i] + " is: " + mass);
                            } else {
                                System.out.println("Mass Not Avaliable");
                            }
                            break;
                        case 'c':
                        double charge = getMass(elementNameList[i]);
                        if (charge != 0) {
                            System.out.println("The charge of " + elementNameList[i] + " is: " + getCharge(elementNameList[i]));
                            break;
                        } else {
                            System.out.println("Charge Not An Option");
                        }
                        default:
                            System.out.println("Not an Option");
                    }
                    break;
                }
            }

            if (!conditionalVar) {
                System.out.println("Element not found in the periodic table. Please try again.");
            }

            // Ask if the users wants to continue studying or exit the program
            System.out.println("Do you want to continue (yes/no)?");
            String continueChoice = scr_scanner.nextLine().toLowerCase();
            if (!continueChoice.equals("yes")) {
                System.out.println("Good Bye! Good Luck!");
                break;
            }
        }

        scr_scanner.close();
    }

    /**
     * Get the mass of an element.
     * @param element The name of the element.
     * @return The mass of the element, or 0 if the mass is not available.
     * If 0, the switch statement logic nullifies the output for an error.
     */
    public static double getMass(String element) {
        switch (element.toLowerCase()) {
            case "hydrogen":
                return 1.008;
            case "helium":
                return 4.0026;
            case "lithium":
                return 6.94;
            case "beryllium":
                return 9.0122;
            case "boron":
                return 10.81;
            case "carbon":
                return 12.011;
            case "nitrogen":
                return 14.007;
            case "oxygen":
                return 15.999;
            case "fluorine":
                return 18.998;
            case "neon":
                return 20.18;
            case "sodium":
                return 22.99;
            case "magnesium":
                return 24.305;
            case "aluminum":
                return 26.982;
            case "silicon":
                return 28.085;
            case "phosphorus":
                return 30.974;
            case "sulfur":
                return 32.06;
            case "chlorine":
                return 35.45;
            case "argon":
                return 39.948;
            case "potassium":
                return 39.098;
            case "calcium":
                return 40.078;
            default:
                return 0;
        }
    }

    /**
     * Get the charge of an element.
     * @param element The name of the element.
     * @return The charge of the element, or 0 if the charge is not available or error.
     * If 0, the switch statement logic nullifies the output for an error.
     */
    public static int getCharge(String element) {
        switch (element.toLowerCase()) {
            case "hydrogen":
                return 1;
            case "helium":
                return 0;
            case "lithium":
                return 1;
            case "beryllium":
                return 2;
            case "boron":
                return 3;
            case "carbon":
                return 4;
            case "nitrogen":
                return -3;
            case "oxygen":
                return -2;
            case "fluorine":
                return -1;
            case "neon":
                return 0;
            case "sodium":
                return 1;
            case "magnesium":
                return 2;
            case "aluminum":
                return 3;
            case "silicon":
                return 4;
            default:
                return 0;
            }
        }
    }
