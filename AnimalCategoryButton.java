import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnimalCategoryButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimalCategoryButton extends Actor
{
    WordList wordList;
    boolean animalBtnClicked;
    
    AnimalCategoryButton() {
        wordList = new WordList();
        animalBtnClicked = false;
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("buttonClick.mp3");
            
            System.out.println("Selected Animal Category");
            //Have to send the category name to WordList class
            wordList  = new WordList("Animal");
            
            animalBtnClicked = true;
        }
    } 
    
    public boolean isAnimalBtnClicked() {
        return animalBtnClicked;
    }
    
   public WordList getWordList() {
       return wordList;
    }
    
    
    
}
