package gamepackage;
import java.util.Scanner;
public class Player {
   private int guessingNumber;
    public int getGuessingNumber(int lower,int upper) {
        Scanner input=new Scanner(System.in);
        System.out.print("Player Please guess the number between "+lower+" and "+upper+": ");
        guessingNumber=input.nextInt();
        if(guessingNumber<lower && guessingNumber>upper) {
            System.out.print("Please guess the number within above range");
            System.exit(0);
        }
        return guessingNumber;
    }
}
