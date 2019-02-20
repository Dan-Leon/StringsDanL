package com.company;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
	// comparing strings in a questionnaire to a user.
        int correct = 0;
        System.out.print("The following five questions are to test your knowledge on the internal workings of a " +
                "vehicle.\nPlease fill in the blank to the best of your ability.\n");
        System.out.println("-------------------------------------------------");
        String userAnswer1 = getInput("Which system is responsible for starting your car? (your answer must " +
                "include the word system)");
        System.out.println("You have entered: " + userAnswer1);
        boolean valid1 = userAnswer1.equalsIgnoreCase("Ignition System");
        try {  //try and catch statement is necessary because the pause throws an exception
            TimeUnit.SECONDS.sleep(1);  //creates a pause for 1 second in the program.
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if (valid1) {  //tests to see that the variable is true
            correct += 1;  //keeps a running tally of how many questions were answered correctly
            System.out.println("Correct. \n");
        } else {
            System.out.println("Incorrect. \n");
        }

        String userAnswer2 = getInput("What system is responsible for keeping you warm inside your car?");
        System.out.println("You have answered: " + userAnswer2);
        boolean valid2 = userAnswer2.equalsIgnoreCase("Cooling System");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if (valid2) {
            correct += 1;
            System.out.println("Correct. \n");
        } else {
            System.out.println("Incorrect.\n");
        }

        String userAnswer3 = getInput("Under/Over inflated tires and poor wheel alignment are both problems " +
                "that causes damage to what system?");
        System.out.println("You have answered: " + userAnswer3);
        boolean valid3 = userAnswer3.equalsIgnoreCase("Suspension System");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (valid3) {
            correct += 1;
            System.out.println("Correct. \n");
        } else {
            System.out.println("Incorrect.\n");
        }

        String userAnswer4 = getInput("If you see brown in the coolant, that is typically a sign of what cause?");
        System.out.println("You have entered: " + userAnswer4);
        boolean valid4 = userAnswer4.equalsIgnoreCase("Blown Head Gasket");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (valid4) {
            correct += 1;
            System.out.println("Correct. \n");
        } else {
            System.out.println("Incorrect.\n");
        }

        String userAnswer5 = getInput("Fuel injectors are connected to the engine by what part on multipoint " +
                "and sequential fuel injection systems?");
        System.out.println("You have entered: " + userAnswer5);
        boolean valid5 = userAnswer5.equalsIgnoreCase("intake manifold");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (valid5) {
            correct += 1;
            System.out.println("Correct. \n");
        } else {
            System.out.println("Incorrect.\n");
        }

        System.out.println("You got " + correct + " answers correct.");


    }

    private static String getInput(String sLabel){
        String getInput;
        Scanner sc = new Scanner(System.in);
        System.out.println(sLabel);
        getInput = sc.nextLine();
        return getInput;
    } // had to change this because it was only accepting a single word in the string, this now accepts statements.
    // I changed System.out.print(sLabel); to System.out.println(sLabel); **println from print**
    //getInput = sc.next(); to getInput = sc.nextLine();  ** sc.nextLine from sc.next **
}
