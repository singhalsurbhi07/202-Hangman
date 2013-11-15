import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Label_Lives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lives extends Actor
{
    
    public void updateNoOfLives(World world, int noOfLives)
    {
      String lives = "Lives" + noOfLives;
      System.out.println("The lives object is : " + lives);
      
      List livesList = world.getObjects(Lives.class);
      if(!livesList.isEmpty())
      {
          int size= livesList.size();
          world.removeObject((Actor)livesList.get(size-1));
      }
      
            
      if(noOfLives==0){
        Message msg = new Message();
        msg.setScale(300,40);
        msg.drawMessage("All your lives are lost!!\n Game Over!!!");
       // Lives_Message msg = new Lives_Message();
        world.addObject(msg, 800, 180);
        Greenfoot.delay(100);
      }
    }
     

    public Lives()
    {
    }
   
    public void act()
    {
        // Add your action code here.
    }    
    
   
    
}
