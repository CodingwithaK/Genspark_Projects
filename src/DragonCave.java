import java.util.Scanner;

public class DragonCave {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("You are in a land full of dragons.");
        System.out.println("In front of you, you see two caves.");
        System.out.println(" In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");
        int input = getInput.nextLine();

        if (input == 1){
            System.out.println("You approuach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        else if (input == 2){
            System.out.println("You approuach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("A mountain of gold pours out!!!");
            System.out.println("You take half and leave the cave unscathed.");
        }
    }
}