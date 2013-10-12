import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class M here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class M extends VirtualKeyboard
{
    /**
     * Act - do whatever the M wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public M()
    {
      image.drawString("M", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    
   public void act() 
    {
     /* Hangman hangman = (Hangman) getWorld();
       wordtoguess = hangman.getWordToGuess();*/
        WordToGuess wordtoguess = new WordToGuess();
        
        if(Greenfoot.mouseClicked(this) && !isClick)
        {
           image.setColor(Color.GREEN); 
           image.drawString("M", x, y);
           wordtoguess.setAlphabetGuessed("M",getWorld());
           isClick = true;
        }

    }           
}
