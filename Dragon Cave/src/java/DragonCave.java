import java.util.Scanner;

public class DragonCave {

    int cave;
    public void beginStory(){
        System.out.println("You are in a land full of dragons.");
        System.out.println("In front of you, you see two caves.");
        System.out.println(" In one cave, the dragon is friendly and will share his treasure with you.");
        System.out.println("The other dragon is greedy and hungry and will eat you on sight.");
        System.out.println("Which cave will you go into? (1 or 2)");

        getCave();

    }

     public int getCave(){
        Scanner getInput = new Scanner(System.in);
        this.cave = getInput.nextInt();
        finishStory(this.cave);

        return 0;

    }

     public  void finishStory(int cave){
        if (this.cave == 1){
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite!");
        }
        else if (this.cave == 2){
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("A mountain of gold pours out!!!");
            System.out.println("You take half and leave the cave unscathed.");
        }

    }
     public static void main(String[] args){
        new DragonCave().beginStory();
     }

}