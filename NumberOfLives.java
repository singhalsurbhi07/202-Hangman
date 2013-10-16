import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NumberOfLives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberOfLives extends Actor
{
private static int noOfLives;
Lives1 lives1 = new Lives1();
Hangman hg;
World world;
public NumberOfLives(int count)
{
    this.setNoOfLives(count);  
}


public void setNoOfLives(int noOfLives)
{
    this.noOfLives = noOfLives;
}

public int getNoOfLives()
{
    return noOfLives;
}

public static int updateNumberOfLives()
{
    noOfLives--;
    return noOfLives;
    
}




    /**
     * Act - do whatever the NumberOfLives wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
