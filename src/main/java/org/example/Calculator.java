package org.example;


import java.util.Scanner;

public class Calculator
{
    public static void main( String[] args )
    {
       /* Declares inputs and outputs
       double for input numbers
       char for operators
       double for outputs(answer)
        */
        double num1 = 0;
        double num2 = 0;
        char operator;
        double answer = 0.0;

        /* Imported Scanner object (top line and below in code)
        for user input
         */

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Enter first number: ");
        num1 = scanObject.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scanObject.nextDouble();
        System.out.println("Select operation: ");
        operator = scanObject.next().charAt(0);

        /* Switch statement, receives operator variable input and choose a case
         */
        switch (operator) {
            case '+': answer = num1 + num2;
            break;
            case '-': answer = num1 - num2;
            break;
            case '*': answer = num1 * num2;
            break;
            case '/': answer = num1 / num2;
            break;
        }
        /* Displays answer
         */
        System.out.println(num1+" "+operator+" "+num2+" = "+answer);
    }
}
