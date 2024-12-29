import java.util.Random;
import java.util.Arrays;
import static java.lang.Math.*;

public class ArrayCalculation {

    // Method to calculate the values based on the given formulas
    public static double calculateElement(int z, double x) {
        if (z == 24) {
            return asin(cos(log(pow(tan(x), 2))));
        } else if (Arrays.asList(8, 12, 14, 18, 20).contains(z)) {
            return exp(pow(x, 4.0 / 5.0));
        } else {
            double numerator = pow(atan(2.2445 / (pow(x, 1.5) - 2)), 3);
            double denominator = PI - (2 - sqrt(exp(x)));
            return numerator / denominator;
        }
    }

    // Method to print the matrix in the specified format
    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%-8.3f", matrix[i][j]);  // Print each element with 3 decimal places
            }
            System.out.println();  // New line after each row
        }
    }

    // Main method
    public static void main(String[] args) {
        // Step 1: Create and fill the array 'z' with even numbers from 6 to 24
        int[] z = {6, 8, 10, 12, 14, 16, 18, 20, 22, 24};

        // Step 2: Create and fill the array 'x' with random numbers from -3.0 to 12.0
        double[] x = new double[15];
        Random random = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = -3.0 + (15.0) * random.nextDouble();  // range -3.0 to 12.0
        }

        int varr[][] = new int[2]
        int varr[][] = new int[2][]; // Allocate 2 rows
        varr[0] = new int[3];        // First row has 3 columns
        varr[1] = new int[5];        // Second row has 5 columns

        // Step 3: Create a two-dimensional array of size 10x15 and fill it using the given formulas
        double[][] result = new double[10][15];

        for (int i = 0; i < z.length; i++) {
            for (int j = 0; j < x.length; j++) {
                result[i][j] = calculateElement(z[i], x[j]);
            }
        }

        // Step 4: Print the result using the new method
        printMatrix(result);  // Calling the separate method to print the matrix
    }
}
