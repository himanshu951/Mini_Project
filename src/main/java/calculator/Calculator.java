package calculator;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public static void main(String[] args) {
        System.out.println("Enter a number to start the program");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        while (true) {
            System.out.println("***********************************CALCULATOR***********************************");
            System.out.println("What do you want to do ?");
            System.out.println("1.Square root \n2.Factorial  \n3.Natural Log \n4.Power \nAny other integer to Quit");
            System.out.print("\n Enter your choice : ");
            int ch = sc.nextInt();
            double res = 0;
            double num, pow;
            switch (ch) {
                case (1): // SquareRoot
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = squareroot(num);
                    break; // Factorial
                case (2):
                    do {
                        System.out.print("Enter no : ");
                        num = (int) sc.nextDouble();
                        if (num < 0)
                            System.out.println("Please enter a positive no. !!!");
                    } while (num < 0);
                    res = factorial(num);
                    break;
                case (3): // Natural Log
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    res = log(num);
                    break;
                case (4): // Power
                    System.out.print("Enter no : ");
                    num = sc.nextDouble();
                    System.out.print("Enter power : ");
                    pow = sc.nextDouble();
                    res = power(num, pow);
                    break;
                default:
                    System.out.println("Closing the application");
                    return;
            }
            System.out.println("Result : " + res);
        }
    }

    public static double squareroot(double n) {
        logger.info("[SQ ROOT] - " + n);
        double res = Math.sqrt(n);
        logger.info("[RESULT - SQ ROOT] - " + res);
        return res;
    }

    public static double factorial(double n) {
        logger.info("[FACTORIAL] - " + n);
        double res = 1L;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        logger.info("[RESULT - FACTORIAL] - " + res);
        return res;
    }

    public static double log(double n) {
        logger.info("[NATURAL LOG] - " + n);
        double res = Math.log(n);
        logger.info("[RESULT - NATURAL LOG] - " + res);
        return res;
    }

    public static double power(double n, double p) {
        logger.info("[POWER - " + n + " RAISED TO] " + p);
        double res = Math.pow(n, p);
        logger.info("[RESULT - POWER] - " + res);
        return res;
    }
}









// package calculator;

// import java.util.InputMismatchException;
// import java.util.Scanner;
// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;

// public class Calculator {
//     private static final Logger logger = LogManager.getLogger(Calculator.class);

//     public Calculator() {
//     }

//     public static void main(String[] args) {
//         Calculator calculator = new Calculator();
//         Scanner scanner = new Scanner(System.in);
//         double d_number1, d_number2;
//         int i_number1;

//         // When the Docker container is started in the background via Ansible and you attach your terminal to it,
//         // the initial application System.out.println statements are wiped out, to avoid that we use this stop-gap fix
//         // Only enter the application once the user has pressed Enter key on the terminal.
//         System.out.println("Press Enter key to start the application\n");
//         scanner.nextLine();

//         do {
//             System.out.println("Calculator-DevOps, Choose to perform operation");
//             System.out.print(
//                 "Enter 1 to find Factorial\n" +
//                 "Enter 2 to find Square Root\n" +
//                 "Enter 3 to find Power\n" +
//                 "Enter 4 to find Natural Logarithm\n" +
//                 "Enter any other input to Exit\n" +
//                 "Enter your choice: "
//             );

//             int choice;

//             try {
//                 choice = scanner.nextInt();
//             }
//             catch (InputMismatchException error) {
//                 System.out.println("Exiting....");
//                 scanner.close();
//                 return;
//             }

//             switch (choice) {
//                 case 1:
//                     // find factorial
//                     i_number1 = -1;

//                     // Keep executing do-while loop till user enters a non-negative integer
//                     while (i_number1 < 0) {
//                         try {
//                             System.out.print("Enter a non-negative integer : ");
//                             i_number1 = scanner.nextInt();

//                             if (i_number1 < 0)
//                                 System.out.println("Factorial is only applicable for non-negative integers");
//                             else
//                                 System.out.println("Factorial of " + i_number1 + " is: " + calculator.factorial(i_number1) + "\n");
//                         }
//                         // To handle cases where user enters non-numeric input
//                         catch (InputMismatchException e) {
//                             System.out.println("Factorial is only applicable for non-negative integers");
//                         }
//                         scanner.nextLine(); // Clear the buffer to receive new input
//                     }

//                     break;

//                 case 2:
//                     // find square root
//                     d_number1 = -1;

//                     // Keep executing do-while loop till user enters a non-negative number
//                     while (d_number1 < 0) {
//                         try {
//                             System.out.print("Enter a non-negative number: ");
//                             d_number1 = scanner.nextDouble();

//                             if (d_number1 < 0)
//                                 System.out.println("Square Root is only applicable for non-negative numbers");
//                             else
//                                 System.out.println("Square Root of " + d_number1 + " is: " + calculator.squareRoot(d_number1) + "\n");
//                         }
//                         // To handle cases where user enters non-numeric input
//                         catch (InputMismatchException e) {
//                             System.out.println("Square Root is only applicable for non-negative numbers");
//                         }
//                         scanner.nextLine(); // Clear the buffer to receive new input
//                     }

//                     break;

//                 case 3:
//                     // find power
//                     d_number1 = Double.POSITIVE_INFINITY; d_number2 = Double.POSITIVE_INFINITY;
//                     while (d_number1 == Double.POSITIVE_INFINITY) {
//                         try {
//                             System.out.print("Enter the first number: ");
//                             d_number1 = scanner.nextDouble();
//                         }
//                         // To handle cases where user enters non-numeric input
//                         catch (InputMismatchException e) {
//                             System.out.println("Non-numeric input is not valid");
//                         }
//                         scanner.nextLine(); // Clear the buffer to receive new input
//                     }
//                     while (d_number2 == Double.POSITIVE_INFINITY) {
//                         try {
//                             System.out.print("Enter the second number: ");
//                             d_number2 = scanner.nextDouble();
//                         }
//                         // To handle cases where user enters non-numeric input
//                         catch (InputMismatchException e) {
//                             System.out.println("Non-numeric input is not valid");
//                         }
//                         scanner.nextLine(); // Clear the buffer to receive new input
//                     }

//                     System.out.println(d_number1 + " raised to " + d_number2 + " is: " + calculator.power(d_number1, d_number2));
//                     System.out.println("\n");
//                     break;

//                 case 4:
//                     // find natural log
//                     d_number1 = 0;

//                     // Keep executing do-while loop till user enters a positive number
//                     while (d_number1 <= 0) {
//                         try {
//                             System.out.print("Enter a positive number: ");
//                             d_number1 = scanner.nextDouble();

//                             if (d_number1 <= 0)
//                                 System.out.println("Natural Logarithm is only applicable for positive numbers");
//                             else
//                                 System.out.println("Natural Logarithm of " + d_number1 + " is: " + calculator.naturalLog(d_number1) + "\n");
//                         }
//                         // To handle cases where user enters non-numeric input
//                         catch (InputMismatchException e) {
//                             System.out.println("Natural Logarithm is only applicable for positive numbers");
//                         }
//                         scanner.nextLine(); // Clear the buffer to receive new input
//                     }

//                     break;

//                 default:
//                     System.out.println("Exiting....");
//                     scanner.close();
//                     return;
//             }
//         } while (true);
//     }

//     public int factorial(int number1) {
//         logger.info("[FACTORIAL] - " + number1);

//         int result = 1;
//         for(int i = 1; i <= number1; i++)
//             result *= i;

//         logger.info("[RESULT - FACTORIAL] - " + result);
//         return result;
//     }

//     public double squareRoot(double number1) {
//         logger.info("[SQ ROOT] - " + number1);
//         double result = Math.sqrt(number1);
//         logger.info("[RESULT - SQ ROOT] - " + result);
//         return result;
//     }

//     public double power(double number1, double number2) {
//         logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
//         double result = Math.pow(number1,number2);
//         logger.info("[RESULT - POWER] - " + result);
//         return result;
//     }

//     public double naturalLog(double number1) {
//         logger.info("[NATURAL LOG] - " + number1);
//         double result = 0;

//         try {
//             if (number1 < 0) {
//                 result = Double.NaN;
//                 throw new ArithmeticException("Case of NaN 0.0/0.0");
//             }
//             else
//                 result = Math.log(number1);
//         }
//         catch (ArithmeticException error) {
//             System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
//         }
//         logger.info("[RESULT - NATURAL LOG] - " + result);
//         return result;
//     }
// }
