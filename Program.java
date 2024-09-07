//import stuff here

//Your code here
import java.util.Scanner;

public class IntegerOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double average = (firstNumber + secondNumber) / 2.0;
        int absoluteValue = Math.abs(difference);
   
        int maximum = (firstNumber + secondNumber + absoluteValue) / 2;

        int minimum = (firstNumber + secondNumber - absoluteValue) / 2;
      
        System.out.println("Original numbers are " + firstNumber + " and " + secondNumber);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.printf("Average = %.1f%n", average);
        System.out.println("Absolute value = " + absoluteValue);
        System.out.println("Maximum = " + maximum);
        System.out.println("Minimum = " + minimum);

    }
}

//Paste console output below:
/*
Enter number 1: 13
Enter number 2: 20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13

*/
