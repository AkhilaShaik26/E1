import java.util.Random;

public class SimpleRandomEvenNumbers {
    public static void main(String[] args) {
        int arraySize = 10; // Adjust the size of the array as needed
        int[] evenNumbers = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            int randomEven = 2 * (random.nextInt(25) + 1); // Generates random even numbers between 2 and 50
            evenNumbers[i] = randomEven;
        }

        // Display the generated even numbers
        System.out.println("Random even numbers between 1 and 50:");
        for (int number : evenNumbers) {
            System.out.print(number + " ");
        }
    }
}

