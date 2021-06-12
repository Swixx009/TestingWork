import  java.util.Random;

public class DiceGame{

  public static void main(String[] args) {

    Random Die1 = new Random();
    Random Die2 = new Random();
    //Roll integers
    int DieRolls = 10;
    int computerDie;
    int UserDie;
    int computerScore = 0;
    int UserScore = 0;

    for(int Roll = 1; Roll <= DieRolls; Roll ++) {

      computerDie = Die1.nextInt(6) + 1;
      UserDie = Die2.nextInt(6) + 1;

      //  System.out.println(computerDie);
      //System.out.println(UserDie);

      if (computerDie > UserDie ) {
        computerScore += 1;
        System.out.println("Computer Wins Turn.  " + Roll + " Score Computer:  " + computerScore);

      } else if ( UserDie > computerDie) {
        UserScore += 1;
        System.out.println("Player Wins Turn.  " + Roll + " Score User:  " + UserScore);
      } else if (UserDie == computerDie) {

        System.out.println("Tied");
      } else {
        System.out.println();
      }
    }

    if (computerScore > UserScore) {
      System.out.println("Computer Wins.  " + computerScore);
    } else if (UserScore > computerScore) {
      System.out.println();
      System.out.println("Player Wins.  " + UserScore);
    } else if(computerScore == UserScore) {
      System.out.println("Game Tied, Computer Score  " + computerScore + "  UserScore  " +  UserScore);
    }else {
      System.out.println();
    }
  }

}
/* Prints "Hello, World" to the terminal window.
System.out.println("Hello, World");*/
