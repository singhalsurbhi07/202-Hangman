import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class N here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N extends VirtualKeyboard
{
    /**
     * Act - do whatever the N wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public N()
    {
      image.drawString("N", x, y);
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
           image.drawString("N", x, y);
           wordtoguess.setAlphabetGuessed("N",getWorld());
           isClick = true;
        }

    }         
}
