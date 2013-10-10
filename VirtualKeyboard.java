import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class VirtualKeyboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VirtualKeyboard extends Actor
{
    public static final float FONT_SIZE = 20.0f;
    public static final int WIDTH = 50;
    public static final int HEIGHT = 50;
    public final int x  = 20;
    public final int y = 34;
    GreenfootImage gi = getImage();
    GreenfootImage image;
    
    /**
     * Act - do whatever the VirtualKeyboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public  VirtualKeyboard()
    {
      
      image=new greenfoot.GreenfootImage(50,50);
      int x = 0;
      int y = 0;
      image.setColor(new Color(0,0,128));
      image.fillRect(0, 0, WIDTH, HEIGHT);
      image.setColor(new Color(0, 191, 255, 128));
      image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
      Font font = image.getFont();
      font = font.deriveFont(FONT_SIZE);
      image.setFont(font);
      image.setColor(Color.WHITE);
      
  
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
