import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        //declare variables
        Scanner inputSc = new Scanner(System.in);
        String dogName;
        String [] dogBreeds = new String[]{"St.Bernard","Chihuahua","Dramatic RedNosed Asian Pug",
        "Common Cur", "King Doberman"};
        Random rnd = new Random();
        int randomNum, sum=0;

        //get the user's dog name
        System.out.println("What is your dog's name? ");
        dogName = inputSc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName +
                "'s prestigious background right here.");
        System.out.println(dogName + " is:");

        //the background DNA test
        for(int i=0;i<5;i++) {
            if(i!=4) {
                randomNum = rnd.nextInt((100 - sum)) + 1;
                System.out.println(randomNum + "% " + dogBreeds[i]);
                sum += randomNum;
                if(sum==100){
                    break;
                }
            }
            else{
                int lastBreed = 100-sum;
                System.out.println(lastBreed + "% " + dogBreeds[i]);
                sum+=lastBreed;
            }// for the last element, we are doing subtraction because we have to add up to %100
        }

        System.out.println("Wow, that's QUITE the dog!");
    }
}
