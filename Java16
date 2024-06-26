// A program to use random package and a dice is rolled on the spaces.
package rose_calculator;
import java.util.*;
import java.util.Random;

public class GrossPayCalculator {
    public static void main(String[] args) {

        Random random = new Random();
        int spaces = 20;
        int total = 0;

            for (int i = 0; i < 5; i++) {
                int dice = random.nextInt(6) + 1;
                total += dice;

                if(total==20) System.out.println("You got " + dice + " on dice, you are at " + total + " . You won baby");
                else if (total>20) System.out.println("You got " + dice + " on dice. You loose");
                else System.out.println("You got " + dice + " on dice, you are at " + total + " . You need " + (spaces - total) + " more spaces to win.");
            }
    }
}
