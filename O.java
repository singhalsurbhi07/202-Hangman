import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class O here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class O extends VirtualKeyboard
{
    /**
     * Act - do whatever the O wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public O()
    {
      image.drawString("O", x, y);
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
           image.drawString("O", x, y);
           wordtoguess.setAlphabetGuessed("O");
           isClick = true;
        }

    }  
}
