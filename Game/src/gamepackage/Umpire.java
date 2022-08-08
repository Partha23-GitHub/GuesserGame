package gamepackage;

public class Umpire {
   private int upper,lower;
    Umpire(int lower,int upper){ // umpire constructor for setting lower & upper
        this.upper=upper;
        this.lower=lower;
    }
   private int numFromGuesser,numFromPlayer1,numFromPlayer2,numFromPlayer3;
    public void collectNumFromGuesser() {
        Guesser g=new Guesser();
        numFromGuesser=g.returnGuessingNumber(lower,upper);
    }
    public void collectNumberFromPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.getGuessingNumber(lower,upper);
        numFromPlayer2=p2.getGuessingNumber(lower,upper);
        numFromPlayer3=p3.getGuessingNumber(lower,upper);
    }
    void compare() {
        if(numFromGuesser==numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
                System.out.print("Game tied all three players guessed correctly");
            }
            else if(numFromGuesser==numFromPlayer2) {
                System.out.print("Player 1 and Player2 won the game");
            }
            else if(numFromGuesser==numFromPlayer3) {
                System.out.print("Player 1 and Player3 won ");
            }
            else {
                System.out.print("Player 1 won the game");
            }
        }


        else if(numFromGuesser==numFromPlayer2) {
            if(numFromGuesser==numFromPlayer3) {
                System.out.print("Player 2 and Player3 won the game");
            }
            else {
                System.out.print("Player 2 won the game");
            }
        }
        else if(numFromGuesser==numFromPlayer3) {
            System.out.print("Player 3 won the game");
        }
        else {
            System.out.print("Game lost! try again");
        }
    }
}
