import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Message extends Actor
{
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Message(String message)
    {
        GreenfootImage image = getImage() ;
        image.scale( 25, 25 ) ; 

        image.drawString(message,5, 15);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
