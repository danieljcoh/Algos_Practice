import java.util.Random;

public class RPS {

    //This is presently not a good way to do this.
    public static void main (String [] args) {


    }

    public static void rockPaperScissors(String playerChoice){

        String[] strArray = {"Paper", "Rock", "Scissors"};
        Random r = new Random(); 
        int randomNumber = r.nextInt(strArray.length); 
        System.out.println(arr[randomNumber]); 

        if(randomNumber == 0 && playerChoice == "Scissors" || "scissors"){
            System.out.println("You win!");
        }
    }

}