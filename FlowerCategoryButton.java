import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlowerCategoryButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlowerCategoryButton extends Actor
{
    WordList wordList;
    boolean flowerBtnClicked;

    FlowerCategoryButton(){
        wordList = new WordList();
        flowerBtnClicked = false;
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("buttonClick.mp3");
            System.out.println("Selected Flower Category");
            //Send the category name to WordList Class
            wordList = new WordList("Flower");
            flowerBtnClicked = true;
        }
    }    

    public boolean isFlowerBtnClicked(){
        return flowerBtnClicked;
    }

    public WordList getWordList(){
        return wordList;
    }
}
