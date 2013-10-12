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
  private String alphabetGuessed;
    
  
    public void act() 
    {
        // Add your action code here.
    }    
    
    
    public void setAlphabetGuessed(String alphabet)
    {
        alphabetGuessed = alphabet;
        System.out.println("User guessed "+ alphabetGuessed);
    }
    
    public void setAlphabetGuessed(String alphabet, World world) {
        
    }
    
}
