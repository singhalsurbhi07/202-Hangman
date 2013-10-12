import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class S here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class S extends VirtualKeyboard
{
    /**
     * Act - do whatever the S wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public S()
    {
      image.drawString("S", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    
    public void act() 
    {
       Hangman hangman = (Hangman) getWorld();
       wordtoguess = hangman.getWordToGuess();
      
        
        if(Greenfoot.mouseClicked(this) && !isClick)
        {
           image.setColor(Color.GREEN); 
           image.drawString("S", x, y);
           wordtoguess.setAlphabetGuessed("S");
           isClick = true;
        }

    } 
}
