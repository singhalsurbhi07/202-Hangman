import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B extends VirtualKeyboard
{
    /**
     * Act - do whatever the B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public B()
    {
      image.drawString("B", x, y);
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
           image.drawString("B", x, y);
           wordtoguess.setAlphabetGuessed("B");
           isClick = true;
        }

    }        
}
