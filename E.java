import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class E here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class E extends VirtualKeyboard
{
    /**
     * Act - do whatever the E wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public E()
    {
      image.drawString("E", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    
    public void act() 
    {
       /*Hangman hangman = (Hangman) getWorld();
       wordtoguess = hangman.getWordToGuess();*/
       WordToGuess wordtoguess = new WordToGuess();
      
        
        if(Greenfoot.mouseClicked(this) && !isClick)
        {
           image.setColor(Color.GREEN); 
           image.drawString("E", x, y);
           wordtoguess.setAlphabetGuessed("E", getWorld());
           isClick = true;
        }

    } 
}
