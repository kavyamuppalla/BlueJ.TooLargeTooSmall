import java.util.Scanner;
public class TooLargeTooSmall {
    
    public static void main(String[] args) { 
        
        int secretNumber;
        int guess;
        int count = 0;
        boolean match = false;
        secretNumber = (int) (Math.random() * 10);
        System.out.println("Secret number is" +secretNumber);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter guess number between 1 to 10 :");
        while(match == false) {
        
        count++;
        guess = sc.nextInt();
        
        System.out.println("Guess number is :" +guess);
   
       
       if(secretNumber == guess) { 
            System.out.println("Correct Guess");
            match = true;
        }
        else if(guess > secretNumber) {
            System.out.println("Number is too Large");
          
        }
        else if(guess < secretNumber) {
            System.out.println("Number is too Small");
           
            
        }
        
    }
        System.out.println("number of guess" +count);
    }
        
}

