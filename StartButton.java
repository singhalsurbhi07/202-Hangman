import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    StartScreen startScreen;
    SelectMessage selectMessage = new SelectMessage();
   
    
    public StartButton(StartScreen startScreen) {
        this.startScreen = startScreen;
    }
    
    public StartButton() {
        
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            System.out.println("Clicked the Start Button");
            String word = WordList.getWord();
            if (word == null) {
                
                startScreen.addObject(selectMessage, 420, 230);
                Greenfoot.delay(60);
                startScreen.removeObject(selectMessage);
                
            } else {
                WordList.clearWord();
                Greenfoot.setWorld(new Hangman(word));
            }
        }
    }    
}
