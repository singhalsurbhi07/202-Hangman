import greenfoot.*; 
/**
 * Write a description of class GameEnded here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameEnded implements iHangmanState 
{
    // instance variables - replace the example below with your own
     iHangmanState gameStarted = new GameStarted();
    private int x;

    /**
     * Constructor for objects of class GameEnded
     */
    public void initScreen()
    {
        //code to create the start screen with categories
         Greenfoot.setWorld(new StartScreen());
    }
    
    public void keyPressed(String alphabet, World world)
    {
        
    }
    
   
    
    public void quit()
    {
        
    }
    
    
    
    public void startButtonPressed(String word)
    {
        //code to change the screen to hangman game screen
        Greenfoot.setWorld(new Hangman(word));
        HangmanGame.setState(HangmanGame.getGameStartedState());

        
    }
     public void placeGuessedAlphabet(String alphabet, int[] arr, int size, String word, World world)
     {
      
        }
        
         public void reduceNoOfLives(World world)
     {
        
     }
}
