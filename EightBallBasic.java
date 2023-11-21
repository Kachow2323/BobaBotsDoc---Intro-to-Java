import java.util.Scanner;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import java.util.Date;

public class EightBallBasic {
    public static void main(String []args){
        int max = 20;
        int min = 1;
        int range = max - min + 1;
        Scanner Scanner1 = new Scanner(System.in);
        System.out.println("Type in your Question:");
        String userQuestion = Scanner1.nextLine();
        System.out.println("Roll the 8 Ball: Yes(1) or No(2)");
        double Input = Scanner1.nextDouble();
        System.out.println("Confirmed");
    
        if (Input == 1 ){
        System.out.println("Rolling...");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        double randNumber = (int)(Math.random() * range) + min;
            if (randNumber == 1){
            System.out.println("It is Certain");
        } else if (randNumber == 2){
            System.out.println("It is decidely so");
        } else if (randNumber == 3){
            System.out.println("Without a doubt");
        }else if (randNumber == 4){
            System.out.println("Yes Definitely");
        }else if (randNumber == 5){
            System.out.println("You may rely on it");
        }else if(randNumber == 6){
            System.out.println("As I see it, yes");                
        }else if (randNumber == 7){
            System.out.println("Most Likely");
        }else if (randNumber == 8){
            System.out.println("Outlook good");
        }else if (randNumber == 9){
            System.out.println("Yes");
        }else if (randNumber == 10){
            System.out.println("Sign points to Yes");
        }else if (randNumber == 11){
            System.out.println("Reply Hazy, Try Again");
        }else if (randNumber == 12){
            System.out.println("Ask again later");
        }else if (randNumber == 13){
            System.out.println("Better not tell you now");
        }else if (randNumber == 14){
            System.out.println("Cannot predict now");
        }else if (randNumber == 15){
            System.out.println("Concentrate and ask again");
        }else if (randNumber == 16){
            System.out.println("My reply is no");
        }else if (randNumber == 17){
            System.out.println("My sources say no");
        }else if (randNumber == 18){
            System.out.println("Outlook not so good");
        }else if (randNumber == 19){
            System.out.println("Very doubtful");
        }else if (randNumber == 20){
            System.out.println("Don't count on it");
        }else{
            System.out.println("ok buddy");
        }
    }
}
}

