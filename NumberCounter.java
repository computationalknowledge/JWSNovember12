// Nov 12 2021 warmup 

/* Write a Java Program to take a start number, an end number, 
and a step number from the command line arguments:
Start from the start number, step up by the step number, end at the end number, 
and sum up all the numbers you step over.
Out put the sum at the end:
Step 1: acquire/store command line arguments (args)
Step 2: make an Algorithm to count from start to end stepNumber number: add up all the numbers you step over

What does the Knowledge Principle tell us to think about?: We need to move data around between classes
 */
public class MainApplication {

    // requring user input in following format: command line args should be
    // startnumber  endnumber  stepNumber
    
    private static int startNumber, endNumber, stepNumber;
    
    public static void main(String[] args) {
        startNumber = Integer.parseInt(args[0]);
        endNumber = Integer.parseInt(args[1]);
        stepNumber = Integer.parseInt(args[2]);
        
        Calculations c = new Calculations(startNumber, endNumber, stepNumber);
    }

}

class Calculations {

    private int startNum, stopNum, stepNum;

    public Calculations(int startNumber, int endNumber, int stepNumber) {
        startNum = startNumber;
        stopNum = endNumber;
        stepNum = stepNumber;
    }

    public int DoCalculations() {
        int sum = 0;
        // @TODO implement the summing algorithm
        return sum;
    }

}
