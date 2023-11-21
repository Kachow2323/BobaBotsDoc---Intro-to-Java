import java.util.Scanner;
public class ScannerPract {
    public static void main(String[] args) {
        Scanner sncr = new Scanner(System.in);
        System.out.println("Input your Age(#):");
        int userInput = sncr.nextInt();
        int ageInFourtyYears = userInput + 40;
        System.out.println("You will " + ageInFourtyYears + " years old in 40 years. Remember to use your time wisely. We can't buy any of it back. - Kachow 2023");
    }
}
// Challenge: Calculate your age 12 years ago