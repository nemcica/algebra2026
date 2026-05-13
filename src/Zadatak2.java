import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesi recenicu: ");
        String input = scanner.nextLine();
        String[] parsedInput = input.split(" ");

        for(int i = parsedInput.length-1; i >=0; i--) {
            System.out.print(parsedInput[i] + ' ');
        }
    }
}
