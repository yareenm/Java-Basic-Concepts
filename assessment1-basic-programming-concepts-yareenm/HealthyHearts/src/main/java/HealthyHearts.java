import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        // declare the variables
        int userAge;
        double maxHeartRate, maxTargetHRZone, minTargetHRZone;
        Scanner inputSc = new Scanner(System.in);

        //get user age
        System.out.println("What is your age? ");
        userAge = Integer.parseInt(inputSc.nextLine());

        //calculate the features
        maxHeartRate = 220-userAge;
        minTargetHRZone = (maxHeartRate/2);
        maxTargetHRZone = (maxHeartRate*85)/(100);

        //display the results
        System.out.println("Your maximum heart rate should be "+ maxHeartRate+" beat per minute");
        System.out.println("Your target HR Zone is " + minTargetHRZone+ " - " + maxTargetHRZone + " beats per minute");

    }
}
