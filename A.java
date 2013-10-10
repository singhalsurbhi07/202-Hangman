import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends VirtualKeyboard
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public A()
    {
      image.drawString("A", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
