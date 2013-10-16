import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
      int noOfLivesRemaining = noOfLives + 1;
      switch(noOfLivesRemaining)
      {
        case 1:
        world.removeObjects(world.getObjects(Lives1.class));
        Lives_Message msg = new Lives_Message();
        world.addObject(msg, 800, 180);
        Greenfoot.delay(100);
        Greenfoot.setWorld(new StartScreen());
        break;
         case 2:
        world.removeObjects(world.getObjects(Lives2.class));
        break;
         case 3:
        world.removeObjects(world.getObjects(Lives3.class));
        break;
         case 4:
        world.removeObjects(world.getObjects(Lives4.class));
        break;
         case 5:
        world.removeObjects(world.getObjects(Lives5.class));
        break;
      }
     // world.removeObjects(world.getObjects(Lives1.class));
      //world.removeObjects(world.getObjects(live.class));
     
    }

    public Lives()
    {
    }
   
    public void act()
    {
        // Add your action code here.
    }    
    
   
    
}
