//Ar_Lazy_Dev

//Java beginner's course - Bro Code (Youtube)
import java.util.Random; //imported the Random class from java utility package
import java.util.Scanner;

public class RandomStuff{

    public static void main(String[] args){

        Random random = new Random(); // created an instance of the Random class
        Scanner scanner = new Scanner(System.in);

        int guess = random.nextInt(100)+1;
        System.out.println("Welcome to Guess the number!");
        System.out.println("Here you're going to guess a number wihtin 1-100 :)");
        System.out.println("Type your guess:");
        int iput = scanner.nextInt();

        while(iput != guess){
            System.out.println("guess again :");
            iput = scanner.nextInt();
        }
        scanner.close();
        if(iput == guess){
            System.out.println("Congratulations, You've guessed it right!");
        }
        
    }
}