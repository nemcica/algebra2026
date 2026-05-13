import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesi velicinu matrice: ");
        int matrixSize = scanner.nextInt();

        int[][] matrix = new int[matrixSize][matrixSize];

        System.out.println("Matrica: ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = i * matrixSize + j + 1;
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
