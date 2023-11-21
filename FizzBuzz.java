public class FizzBuzz {
    public static void main (String []args){
        for (int i = 0; i < 100; i++){
            int a = i % 5;
            int b = i % 3;
            if ( a == 0 && b == 0){
                System.out.println(i + " FizzBuzz");
            }else if (a == 0){
                System.out.println(i + " Fizz");
            }else if (b == 0){
                System.out.println(i + " Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    
}
