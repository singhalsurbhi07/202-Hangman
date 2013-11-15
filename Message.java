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
    
    private int xScale;
    private int yScale;
    private int xMessageStart;
    private int yMessageStart;
    
    public Message(){
     xMessageStart = 5;
     yMessageStart = 15;
    }
    
    public void setScale(int xScale, int yScale)
    {
        this.xScale = xScale;
        this.yScale = yScale;
    }
    
    public void setMessageStart(int xMessageStart, int yMessageStart){
        this.xMessageStart = xMessageStart;
        this.yMessageStart = yMessageStart;
    }
    
    public void drawMessage(String message)
    {
        GreenfootImage image = getImage() ;
        image.scale(xScale, yScale);
        image.drawString(message,xMessageStart,yMessageStart);
        //image.scale( 25, 25 ) ; 
        //image.drawString(message,5, 15);
    }

    public void act() 
    {
        // Add your action code here.
    }    
}
