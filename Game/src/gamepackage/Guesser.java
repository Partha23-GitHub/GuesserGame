package gamepackage;
import java.util.Scanner;
public class Guesser {
    private int guessingNumber;
    public int returnGuessingNumber(int lower,int upper){
        Scanner input=new Scanner(System.in);
        System.out.print("Guesser Please guess the number between "+lower+" and "+upper+": ");
        guessingNumber=input.nextInt();
        if(guessingNumber<lower || guessingNumber>upper) {
            System.out.print("Please guess the number within above range");
            System.exit(0);
        }
        return guessingNumber;
    }
}
