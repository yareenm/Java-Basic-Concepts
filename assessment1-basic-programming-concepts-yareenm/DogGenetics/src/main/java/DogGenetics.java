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
        int sum=0;
        int[] breedPercent = new int[5];

        //get the user's dog name
        System.out.println("What is your dog's name? ");
        dogName = inputSc.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName +
                "'s prestigious background right here.");
        System.out.println(dogName + " is:");

        //the background DNA test
        while(sum!=100){
            sum=0;
            for(int i=0;i<5;i++){
                breedPercent[i] = rnd.nextInt(100)+1;
                sum+=breedPercent[i];
            }
        }


        //display the results
        for(int j=0;j<5;j++){
            System.out.println(breedPercent[j] + "% "+ dogBreeds[j]);
        }

        System.out.println("Wow, that's QUITE the dog!");
    }
}
