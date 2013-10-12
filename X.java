import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class X here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class X extends VirtualKeyboard
{
    /**
     * Act - do whatever the X wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public X()
    {
      image.drawString("X", x, y);
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
           image.drawString("X", x, y);
           wordtoguess.setAlphabetGuessed("X",getWorld());
           isClick = true;
        }

    }         
}
