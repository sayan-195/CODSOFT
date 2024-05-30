import java.util.*;

class Game {
    public int number;
    public int inpNumber;
    public int numberOfGuess=0;

    public int getnumberOfGuess() {
        return numberOfGuess;
    }

    public void setnumberOfGuess(int numberOfGuess) {
        this.numberOfGuess = numberOfGuess;
    }

    Game() {
        Random r = new Random();
        this.number = r.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Welcome to the Game !");
        System.out.print("Guess The Number between 1 to 100 : ");
        Scanner sc = new Scanner(System.in);
        inpNumber = sc.nextInt();
        
    }

    boolean isCorrect() {
        numberOfGuess++;
        if (inpNumber == number) {
            System.out.println("Congratulations ! You Guessed the Right number");
            System.out.println("You Guessed the number in "+numberOfGuess+" attempts");
            return true;
        } else if (inpNumber < number) {
            System.out.println("Too Low....");
        } else if(inpNumber > number) {
            System.out.println("Too high....");
        }

        return false;
    }

}

public class Number_guessing_game {

    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrect();
        System.out.println(b);
        }
    }

}
