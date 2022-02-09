import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        scan.nextLine();

        System.out.println("Great, here are the rules:\n");
        System.out.println("If you roll a 6 the game stops.");
        System.out.println("If you roll a 4 nothing happens.");
        System.out.println("Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");
        scan.nextLine();
        
      
        /* Task 1: 
              1. print: Let's play Rolling Java. Type anything to start.
              2. Get the user to enter any value
        */

        /* Task 2: 
              1. Once the user is ready, print: 
                    Great, here are the rules:\n
                     - If you roll a 6 the game stops.
                     - If you roll a 4 nothing happens.
                     - Otherwise, you get 1 point.\n
                    You must collect at least 3 points to win. Enter anything to roll:
              2. Get the user to enter any value
        */

       int score = 0;

       while (score < 100){
         System.out.println("Please enter a value: ");
         scan.nextLine();
         int diceRoll = rollDice();
         System.out.println("You rolled a " + diceRoll);
         
         if (diceRoll == 6){
           System.out.println("End of Game");
           break;
         }
         else if (diceRoll == 4){
           System.out.println("Zero points. Keep rolling");
           continue;

         }else if (diceRoll != 6 || diceRoll !=4){
           score++;
           System.out.println("One point. Keep rolling");
           continue;
         }

           


         }
         System.out.println("\nYour score is: " + score);
         if (score >= 3){
           System.out.println("Wow, that's lucky. You win!");
         } else {
           System.out.println("Tough luck, you lose :(");
         }
         
       }
      
       /* 
         Task 3
          1. Make a while loop that runs forever
          2. During each run, get them to enter a random value
          
          
          Task 5
           1. During each run, call the rollDice() function.
           2. Print each dice roll like so: You rolled a <diceRoll>.           
           
          
          Task 6
            If the user rolls a 6:
              1. print: End of game.
              2. stop the game. 

            If the user rolls a 4:
              1. print: Zero points. Keep rolling. 

            If the user rolls anything else:
              1. update the points variable by 1
              2. print: One point. Keep rolling. 

       */

      
      /* Task 7
      
           1.  After the game ends, check the user's points.
       
                 System.out.println("\nYour score is: " + score);

           2. If the score is greater than or equal to 3, print:
                  Wow, that's lucky. You win!
              Otherwise, print:
                  Tough luck, you lose :( 
      */

    
    public static int rollDice() {
      double randomNumber = Math.random() * 7;
      int integer = (int) randomNumber;
      return integer;

       

   }
  
    /** Task 4
     * Function name: rollDice – rolls a dice between 1 and 6
     * @return randomNumber (int)
     * 
     */ 
  
  
}
