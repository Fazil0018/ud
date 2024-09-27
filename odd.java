import java.util.Scanner;

public class ValleyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: sequence of steps as a string (e.g., "udduuudu")
        System.out.print("Enter the sequence of steps: ");
        String steps = scanner.nextLine();
        
        // Initialize variables
        int seaLevel =0 ;
        int valleys = 0;
        int altitude = seaLevel;

        // Iterate through each step
        for (char step : steps.toCharArray()) {
            if (step == 'U') {
                altitude++; // Upward step increases altitude
            } else if (step == 'D') {
                altitude--; // Downward step decreases altitude
            }

            // Check if a valley has been completed
            if (altitude == seaLevel && step == 'U') {
                valleys++;
            }
        }

        // Output the number of valleys
        System.out.println("Number of valleys: " + valleys);
        
        scanner.close();
    }
}
