import java.util.Scanner;
class EvenOrOdd {
    public static void main(String[] args) {
      Scanner sncr = new Scanner(System.in);
      System.out.println("Which number are u puzzled by?");
      int userInput = sncr.nextInt();
        if (userInput % 2 == 0){
            System.out.println("EVEN!");
        }else{
            System.out.println("ODD!");
        }
        
        System.out.println("Thank You for Playing");
    }
}
//This Drill will require knowledge of how Scanner works.
//Challenge: Ask if they would they like to repeat the program!