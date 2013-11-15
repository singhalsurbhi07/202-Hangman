import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
   
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,400, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        AnimalCategoryButton animalCategoryButton = new AnimalCategoryButton();
        FlowerCategoryButton flowerCategoryButton = new FlowerCategoryButton();
        PlacesCategoryButton placesCategoryButton = new PlacesCategoryButton();
        addObject(new StartButton(this, animalCategoryButton, flowerCategoryButton, placesCategoryButton), 452,350);
        addObject(animalCategoryButton, 130, 140);
        addObject(flowerCategoryButton, 130, 190);
        addObject(placesCategoryButton, 130, 240);
    }

   
}