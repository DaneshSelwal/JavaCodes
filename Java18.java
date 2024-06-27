// to verify the password entered by the user

package text_processing;

import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        String password;

        do {
            System.out.println("Enter you new password: ");
            password = sc.nextLine();
            valid = passwordChecker(password);
        } while (!valid);
    }

    public static void countWords(String text) {
        String[] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }


    public static boolean passwordChecker(String text) {
        boolean valid = true;
        String dec = "";
        if (text.length() < 8) {
        valid = false;
        dec+=" your password must contain atleast 8 characters.";
        }  if (text.compareTo("ABC_1234") == 0) {
            valid = false;
            dec+=" you entered the same password as the old password.";
        } if (text.compareTo(text.toLowerCase()) == 0) {
            valid = false;
            dec+=" your password must contain an uppercase letter.";
        }  if (text.matches("[a-zA-Z0-9]*")) {
            valid = false;
            dec += " your password must contain a special character.";
        } if (text.contains("johndoe")) {
            valid = false;
            dec+=" your can not use your name in the password.";
        }
        System.out.println(dec);
          return valid;
    }
}
