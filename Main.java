import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(50) + 1;
        //System.out.println("The random number is:" +number );

        int tryCount = 0;
        while(true) {
            System.out.println("Guess a number! (1 - 50) : ");

            int guessedNo = scanner.nextInt();
            tryCount++;

            if (guessedNo == number) {
                System.out.println("Yaay! you got the number right!");
                System.out.println("You got it in " +tryCount + " tries");
                break;
            }
            else if (number > guessedNo) {
                System.out.println("Naah, try a larger number");
            }
            else {
                System.out.println("Naah, try a smaller number");
            }
        }

        scanner.close();
    }
}
