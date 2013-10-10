import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class K here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class K extends VirtualKeyboard
{
    /**
     * Act - do whatever the K wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public K()
    {
      image.drawString("K", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
