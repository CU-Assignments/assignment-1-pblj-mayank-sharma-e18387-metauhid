package Assignment_1.Assignment_1.src;
import java.util.Scanner;

public class String_Analysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        
        StringBuilder alphabetChars = new StringBuilder();
        StringBuilder numericChars = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();
        
        for (int i = 0; i < userInput.length(); i++) {
            char currentChar = userInput.charAt(i);
            if (Character.isLetter(currentChar)) {
                alphabetChars.append(currentChar);
            } else if (Character.isDigit(currentChar)) {
                numericChars.append(currentChar);
            } else if (!Character.isWhitespace(currentChar)) {
                specialChars.append(currentChar);
                System.out.println(currentChar);
            }
        }
        
        System.out.println("Alphabets: " + alphabetChars);
        System.out.println("Digits: " + numericChars);
        System.out.println("Special characters: " + specialChars);
        
        scanner.close();
    }
}
