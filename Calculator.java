import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {

        double firstOp; // declaring doubles for use in calculations
        double secondOp;
        int chosenOp; // to make a choice from shown menu

        Scanner scnr = new Scanner (System.in);

        System.out.print ("Enter first operand: "); // first input for use in calculation
        firstOp = scnr.nextDouble ();
        System.out.print ("Enter second operand: ");
        secondOp = scnr.nextDouble (); //looking for double, input can have decimals

        System.out.println ("Calculator Menu"); // displays menu
        System.out.println ("---------------");
        System.out.println ("1. Addition");
        System.out.println ("2. Subtraction");
        System.out.println ("3. Multiplication");
        System.out.println ("4. Division");

        System.out.print ("Which operation do you want to perform? "); //accepts user input after this
        chosenOp = scnr.nextInt ();

        switch (chosenOp) { //switch statement! based on input, performs calculation and prints
            case 1:
                System.out.println("The result of the operation is " + (firstOp + secondOp) + ". Goodbye!");
                break;
            case 2:
                System.out.println("The result of the operation is " + (firstOp - secondOp) + ". Goodbye!");
                break;
            case 3:
                System.out.println("The result of the operation is " + (firstOp * secondOp) + ". Goodbye!");
                break;
            case 4:
                System.out.println("The result of the operation is " + (firstOp / secondOp) + ". Goodbye!");
                break;
            default:
                System.out.println("Error: Invalid selection! Terminating program."); //used to exit program
        }



    }
}
