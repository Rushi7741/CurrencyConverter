
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the amount in the original currency
        System.out.print("Enter the amount in the original currency: ");
        double amount = scanner.nextDouble();

        // Input the currency code of the target currency
        System.out.print("Enter the currency code of the target currency (e.g., USD, EUR): ");
        String targetCurrencyCode = scanner.next().toUpperCase();

        // Define the conversion rates (as an example)
        double usdToInrRate = 75.0; // 1 USD to INR
        double eurToInrRate = 88.0; // 1 EUR to INR

        // Perform the conversion based on the target currency code
        double convertedAmount;
        switch (targetCurrencyCode) {
            case "USD":
                convertedAmount = amount / usdToInrRate;
                break;
            case "EUR":
                convertedAmount = amount / eurToInrRate;
                break;
            default:
                System.out.println("Unsupported target currency code.");
                return; // Exit the program
        }

        // Display the result
        System.out.println("Converted amount in " + targetCurrencyCode + ": " + convertedAmount);

        // Close the scanner
        scanner.close();
    }
}
