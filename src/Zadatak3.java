import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesi tekst: ");
        String input = scanner.nextLine();

        String[] parsedInput = input.split(" ");
        System.out.println("Broj rijeci: " + parsedInput.length);

        System.out.print("Palindromi: ");
        for (String word : parsedInput) {
            boolean isPalindrome = true;
            String temp = word.toLowerCase();
            for (int i = 0; i < word.length(); i++) {
                if (temp.charAt(i) != temp.charAt(word.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) System.out.print(word + " ");
        }
        System.out.println();

        String vowels = "aeiouAEIOU";
        for (int i = 0; i < parsedInput.length; i++) {
            if (vowels.indexOf(parsedInput[i].charAt(0)) != -1) parsedInput[i] = "Java";
            System.out.print(parsedInput[i] + ' ');
        }
    }
}

