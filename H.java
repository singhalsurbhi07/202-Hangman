import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class H here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class H extends VirtualKeyboard
{
    /**
     * Act - do whatever the H wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public H()
    {
      image.drawString("H", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
