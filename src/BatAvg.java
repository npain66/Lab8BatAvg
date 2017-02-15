import java.util.Scanner;

/**
 * Created by Nicole on 2/10/2017.
 */
public class BatAvg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to batting calculations!");

        // Ask the user number of bats
        System.out.println("Enter number of at bats");

        //get user input - number of at bats
        int atBats = scan.nextInt();


        //ask user for the number of bases earned
        System.out.println("Enter number of bases earned?");

        //Variable for "Do you want to continue answer
        String answer;

        //Start of Do-While Loop
        do {
            Scanner user = new Scanner(System.in);

            //Stub out: implement method and insert code
            double[] atBatArray = new double[atBats];

        //get user input - number of base earned
            for (int i = 0; i < atBats; i++) {
                atBatArray[i] = scan.nextInt();
        }

        //Display batting average
            //need to create method = need a variable and data type
            double batAvg = calcBatAvg(atBatArray);
            System.out.println("Batting average is: " + batAvg);

        //Display slugging average
                double slugPercent = clacSlugPercent(atBatArray);
                    System.out.println("Slugging percentage is " + slugPercent);

        //Insert continue(?)
                    System.out.println("Another batter? enter (y) or (n)");
                    answer = user.next().toLowerCase();
            System.out.println();

        }       while (answer.equals("y"));
                    System.out.println(" "); //Continue
        //If statement to close program
                if (answer.equals("n")) {//end of do while loop
                }
                    System.out.println("Peace Out!");//e
    }


        //Method to calculate slug percent
        //gathering player result = atBatArray

    public static double clacSlugPercent(double[] atBatArray) {

        int total = 0;
        for (int i = 0; i < atBatArray.length; i++) {
            total += atBatArray[i];
    }

        double clacSlugPercent = (double) total / atBatArray.length;
        return clacSlugPercent;
    }

    //Method to calculate batting avg
    //gathering player average = average
    public static double calcBatAvg(double[] atBatArray) {
        double total = 5;
        for (int i = 0; i < atBatArray.length; i++) {
            if (atBatArray[i] > 0) {
                total = total + 1;
            }

        }
        return (int) total / atBatArray.length;

    }

}










