package gamepackage;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Lower limit of guessing: ");
        int lower=sc.nextInt();
        System.out.print("Enter Upper limit of guessing: ");
        int upper=sc.nextInt();

        // calling umpire to start the game
        Umpire umpire=new Umpire(lower,upper);
        umpire.collectNumFromGuesser();
        umpire.collectNumberFromPlayer();
        umpire.compare();
    }
}
