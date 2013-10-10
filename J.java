import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class J here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class J extends VirtualKeyboard
{
    /**
     * Act - do whatever the J wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public J()
    {
      image.drawString("J", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
