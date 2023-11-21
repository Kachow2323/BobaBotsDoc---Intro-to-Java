import java.util.Random;
import java.util.Scanner;

public class EightBallArray {
    public static void main(String []args){

         String [] arr = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes, definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."};
        
        Scanner Scanner1 = new Scanner(System.in);
        Random random = new Random();
        boolean repeat = true;
        int input;
        String question;

        while(repeat == true){
            
            System.out.println("What question distrubs the balance?");
            String userQueString = Scanner1.nextLine();
            System.out.println("OK...");
            System.out.println("Would you like to roll your fate? Yes(1) or No (2)");
            int questionInput = Scanner1.nextInt();


            int randNumber = random.nextInt(arr.length);
            if(questionInput == 1){
                System.out.println(arr[randNumber]);
            }else if (questionInput == 2){
                System.out.println("Scanner Closing...");
                Scanner1.close();
            }
            System.out.println("New Questions? Re-wish? | Yes(1) or No(2)");
            int userRepeat = Scanner1.nextInt();
                if(userRepeat == 2 ){
                    Scanner1.close();
                    repeat = false;
        }
    }
    }
}
// Yes, ik. Shitty code. :)
//My Freshman Year was funny AF :DDDD