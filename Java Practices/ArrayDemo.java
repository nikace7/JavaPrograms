import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // One-dimensional array
        System.out.print("Enter the size of the one-dimensional array: ");
        int size = scanner.nextInt();
        int[] oneDArray = new int[size];
        
        System.out.println("Enter the elements of the one-dimensional array:");
        for (int i = 0; i < size; i++) {
            oneDArray[i] = scanner.nextInt();
        }
        
        // Multi-dimensional array (2D array)
        System.out.print("Enter the number of rows for the two-dimensional array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the two-dimensional array: ");
        int cols = scanner.nextInt();
        int[][] twoDArray = new int[rows][cols];
        
        System.out.println("Enter the elements of the two-dimensional array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                twoDArray[i][j] = scanner.nextInt();
            }
        }
        
        // Displaying the one-dimensional array using for loop
        System.out.println("One-dimensional array using for loop:");
        for (int i = 0; i < size; i++) {
            System.out.print(oneDArray[i] + " ");
        }
        System.out.println();
        
        // Displaying the one-dimensional array using for-each loop
        System.out.println("One-dimensional array using for-each loop:");
        for (int element : oneDArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        // Displaying the two-dimensional array using for loop
        System.out.println("Two-dimensional array using for loop:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        
        // Displaying the two-dimensional array using for-each loop
        System.out.println("Two-dimensional array using for-each loop:");
        for (int[] row : twoDArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
