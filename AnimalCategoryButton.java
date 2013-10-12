import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnimalCategoryButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalCategoryButton extends Actor
{
    WordList w ;
   
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            
            System.out.println("Selected Animal Category");
            //Have to send the category name to WordList class
            w  = new WordList("Animal");           
            
            
            
                        
            
        }
    }    
}
