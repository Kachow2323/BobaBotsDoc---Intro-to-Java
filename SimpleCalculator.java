import java.util.Scanner;
class SimpleCalculator {
  public static void main(String[] args) {
    boolean repeat = true;
    while (repeat == true){
        Scanner sncr = new Scanner(System.in);
        System.out.println("Type First Number");
        int num1 = sncr.nextInt();
        System.out.println("Type Second Number");
        int numberTwo = sncr.nextInt();
        System.out.println("Type the Operator");
        char operator = sncr.next().charAt(0);

        if(operator == '+'){ int ryanChan = num1 + numberTwo;
            if (ryanChan % 2 == 0){System.out.println("Even");} 
            else {System.out.println("Odd");}
            System.out.println("Answer: " +  ryanChan);
        }

        else if(operator == '-'){ int ryanChan2 = num1 - numberTwo;
            if (ryanChan2 % 2 == 0){ System.out.println("Even");}
            else { System.out.println("Odd");}
            System.out.println("Answer: " +  ryanChan2);
        }

        else if(operator == '*'){ int ryanChan3 = num1 * numberTwo;
            if (ryanChan3 % 2 == 0){ System.out.println("Even");}
            else { System.out.println("Odd");}
            System.out.println("Answer: " +  ryanChan3);
        }

        else if(operator == '/'){ int ryanChan4 = num1 / numberTwo;
            if (ryanChan4 % 2 == 0){ System.out.println("Even");}
            else {System.out.println("Odd");}
            if(ryanChan4 == 0){System.out.println("(Improper)Fractional Answer: " + num1 + '/' + numberTwo);}
            System.out.println("Answer: " +  ryanChan4);
        }

        else if(operator == '%'){ int ryanChan5 = num1 % numberTwo;
            if (ryanChan5 % 2 == 0){ System.out.println("Even");}
            else {System.out.println("Odd");}
            System.out.println("Answer: " + ryanChan5);
        }

            else if(operator =='^'){ double squareRoot = Math.sqrt(num1);
            System.out.println("Answer: " + squareRoot);
        }

        else {System.out.println("Ryan needs Help."); 
        }

        System.out.println("Repeat Program (All Previous Calculations are wiped)");
        System.out.println("(Y) = Yes or (N) = No");
        char repeatResponse = sncr.next().charAt(0);
        if (repeatResponse == 'N' || repeatResponse == 'n'){
            repeat = false;
            System.out.println("Thank you for Using :D");}
    }
  }
}
// This is funny code that I wrote as a freshman.
//Yes, the variables are all wacky ;)
// GL, you got this.
//RIP to my other game I tried to make after this. I got lost after variable scope killed my motivation ._.
