import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type something: ");
        String input = scanner.nextLine();
        input = input.trim();

        int nums = 0, letters = 0, other = 0;

        for(int i = 0; i < input.length(); i++) {
            if((input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
                    || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) letters++;
            else if(input.charAt(i) >= '0' && input.charAt(i) <= '9') nums++;
            else other++;
        }

        System.out.println("Slova: " + letters);
        System.out.println("Brojevi: " + nums);
        System.out.println("Ostali znakovi: " + other);

    }
}
