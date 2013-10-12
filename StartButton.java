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
    AnimalCategoryButton animalCategoryButton;
    SelectMessage selectMessage = new SelectMessage();

    public StartButton(StartScreen startScreen, AnimalCategoryButton animalCategoryButton) {
        this.startScreen = startScreen;
        this.animalCategoryButton = animalCategoryButton;
    }

    public StartButton() {

    }

    public void act() 
    {

        if(Greenfoot.mouseClicked(this)){

            if (!animalCategoryButton.isAnimalBtnClicked()) {
                System.out.println("Not Selected the Animal Category");
                startScreen.addObject(selectMessage, 420, 230);
                Greenfoot.delay(60);
                startScreen.removeObject(selectMessage);
            } else {
                //WordList.clearWord();
                System.out.println("Clicked the Start Button");
                WordList wordList  = animalCategoryButton.getWordList();   
                String word = wordList.getWord();
                if (word != null) {
                    Greenfoot.setWorld(new Hangman(word));    
                } else {
                    // display error message ex db down
                }
            }
        }
    }
}    

