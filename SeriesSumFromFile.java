import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeriesSumFromFile {
    public static void main(String[] args) {
        try {
            // Initialize the Scanner to read from a file
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            // Read the first line as a single string
            if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                // Split the line by commas to get each n value
                String[] nValues = line.split(",");

                for (int i = 0; i < nValues.length; i++) {
                    // Parse each n value from the string array
                    int n = Integer.parseInt(nValues[i].trim());

                    // Generate the series representation as a string
                    StringBuilder series = new StringBuilder();
                    for (int j = 1; j <= n; j++) {
                        series.append(j);
                        if (j < n) {
                            series.append("+");
                        }
                    }

                    // Calculate the sum using Gauss' formula
                    int sum = n * (n + 1) / 2;

                    // Output the result for each n value
                    System.out.println(series + " = " + sum);
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Please ensure 'input.txt' exists in the correct directory.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
