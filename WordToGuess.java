import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WordToGuess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordToGuess extends Actor
{
    /**
     * Act - do whatever the WordToGuess wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  //private String alphabetGuessed;
 // private String word;  
  //private int indexOfAlphabet;
  World world;
 // int letterCount;
  //Lives lives = new Lives();
 iHangmanState state=HangmanGame.currentState;
  
  public WordToGuess(){
      
   //   indexOfAlphabet =0;
  }
  
    public void act() 
    {
        // Add your action code here.
    }    
   

    
    public void setAlphabetGuessed(String alphabet, World w)
    {
        
        System.out.println("User guessed "+ alphabet);
        world =w;
        //word = WordList.getWord();
        checkForLetterInString(alphabet);

        
    }
    
   
    private void checkForLetterInString(String alphabet){
        
       String wordFromDB = WordList.getWord();
       String word = wordFromDB.toUpperCase();
       state.keyPressed(alphabet,world);
       
        }
        
      
    }
    

