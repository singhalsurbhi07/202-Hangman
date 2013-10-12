import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class U here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class U extends VirtualKeyboard
{
    /**
     * Act - do whatever the U wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public U()
    {
      image.drawString("U", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    
    public void act() 
    { /* Hangman hangman = (Hangman) getWorld();
       wordtoguess = hangman.getWordToGuess();*/
        WordToGuess wordtoguess = new WordToGuess();
        
        if(Greenfoot.mouseClicked(this) && !isClick)
        {
           image.setColor(Color.GREEN); 
           image.drawString("U", x, y);
           wordtoguess.setAlphabetGuessed("U",getWorld());
           isClick = true;
        }

    } 
}
