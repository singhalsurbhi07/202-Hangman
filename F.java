import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class F here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class F extends VirtualKeyboard
{
    /**
     * Act - do whatever the F wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public F()
    {
      image.drawString("F", x, y);
      gi.drawImage(image,0,0); 
      setImage(image); 
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
