import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlacesCategoryButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacesCategoryButton extends Actor
{
    WordList wordList;
    boolean placesBtnClicked;

    PlacesCategoryButton(){
        wordList = new WordList();
        placesBtnClicked = false;
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("buttonClick.mp3");
            System.out.println("Selected Places Category");
            wordList = new WordList("Places");
            placesBtnClicked = true;         
        }    
    }

    public boolean isPlacesBtnClicked(){
        return placesBtnClicked;
    }

    public WordList getWordList(){
        return wordList;
    }

}    
