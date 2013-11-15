import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameStarted here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameStarted implements iHangmanState 
{
   
    public void initScreen()
    {
        //code to create hangman game screen
        System.out.println("The game is already in Hangman screen!");
    }
    
    public void keyPressed(String alphabet, World world)
    {
        //code to determine if the key pressed is correct or not
        //if correct -> change state to letter guessed        
        //if not correct -> change state to letter not guessed
        
        String wordFromDB = WordList.getWord();
      String  word = wordFromDB.toUpperCase();
        System.out.println("word is "+ word);
        int[] alphabetPosition = new int[word.length()];
        
        int index =0;
        int size = -1;
        int pos =0;
            for(int i=pos;i< word.length(); i ++){

                if((index =word.indexOf(alphabet, pos))!= -1){
                    System.out.println("inside if");
                     alphabetPosition[++size]= index;
                    pos=index+1;
                    System.out.println("index, size, pos : " + index + " "+ size + " " + pos );
                }
                else
                    break;
                
                
            }
                    
            if(size != -1){
               placeGuessedAlphabet(alphabet, alphabetPosition, size+1,word, world);
                System.out.println("leter there");
                HangmanGame.setState(HangmanGame.getLetterGuessedState());
                iHangmanState state = HangmanGame.currentState;
                state.placeGuessedAlphabet(alphabet, alphabetPosition, size+1,word, world);
              
                
            }
            else
            {
                System.out.println("Letter is not present");
                HangmanGame.setState(HangmanGame.getLetterNotGuessedState());
                iHangmanState state = HangmanGame.currentState;
                state.reduceNoOfLives(world);
               
            }
    }
    
    public void noLives()
    {
        
    }
    
    public void quit()
    {
        //code to quit the game
        HangmanGame.setState(HangmanGame.getGameEndedState());
        iHangmanState state = HangmanGame.currentState;
        state.initScreen();
    }
    
    public void gameWon()
    {
        
    }
    
    public void startButtonPressed(String word)
    {
        
    }

    public void placeGuessedAlphabet(String alphabet, int[] arr, int size, String word, World world){
      
     }
     
     public void reduceNoOfLives(World world)
     {
        
     }
}
