import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int play=1;
        int dices;
        int bounces;
        int userguess;
        int diceval;
        int userScore=0;
        int compScore=0;
        JOptionPane.showMessageDialog(null, "Welcome to the number Game!");
        while(play!=0){
            bounces = 1+(int)(Math.random()*5);//Simulates real world bounces
            dices = Integer.parseInt(JOptionPane.showInputDialog("Would you want to use 1, 2, or 3 dices?"));
            if(dices==1){
                Dice dice1= new Dice(bounces);
                userguess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess:"));
                diceval = dice1.Throw();
                if (userguess==diceval){
                    System.out.println("You guessed it!");
                    System.out.println("The number was "+diceval);
                    userScore++;
                }
                else{
                    System.out.println("You were wrong!");
                    System.out.println("The number was "+diceval);
                    compScore++;
                }
            }
            else if (dices==2){
                DoubleDice d2= new DoubleDice(dices,bounces);
                 userguess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess:"));
                diceval = d2.Throw();
                if (userguess==diceval){
                    System.out.println("You guessed it!");
                    System.out.println("The number was "+diceval);
                    userScore++;
                }
                else{
                    System.out.println("You were wrong!");
                    System.out.println("The number was "+diceval);
                    compScore++;
                }
            }
            else{
                TrippleDice d3 = new TrippleDice(bounces);
                  userguess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess:"));
                diceval = d3.Throw(bounces);
                if (userguess==diceval){
                    System.out.println("You guessed it!");
                    System.out.println("The number was "+diceval);
                    userScore++;
                }
                else{
                    System.out.println("You were wrong!");
                    System.out.println("The number was "+diceval);
                    compScore++;
                }
            }
            play =Integer.parseInt(JOptionPane.showInputDialog("Do you want to play again? 1 for yes, 0 for no"));
            if (play==0){
                if(compScore>userScore){
                    System.out.println("The computer beat you!");
                }
                else if (compScore==userScore){
                    System.out.println("You and the computer tied!");
                }
                else{
                    System.out.println("You are the winner!");
                }
            }
            
        }
        
}
}

// The classes culd be cleaner, and you missed the Overloading.
