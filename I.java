import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class I here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class I extends VirtualKeyboard
{
    /**
     * Act - do whatever the I wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public I()
    {
      image.drawString("I", x, y);
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
           image.drawString("I", x, y);
           wordtoguess.setAlphabetGuessed("I",getWorld());
           isClick = true;
        }

    } 
}
