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
    FlowerCategoryButton flowerCategoryButton;
    PlacesCategoryButton placesCategoryButton;
    //SelectMessage selectMessage = new SelectMessage();

    iHangmanState gameEnded = new GameEnded();
    iHangmanState state;

    
    
    public StartButton(StartScreen startScreen, AnimalCategoryButton animalCategoryButton, FlowerCategoryButton flowerCategoryButton,
    PlacesCategoryButton placesCategoryButton) {
        this.startScreen = startScreen;
        this.animalCategoryButton = animalCategoryButton;
        this.flowerCategoryButton = flowerCategoryButton;
        this.placesCategoryButton = placesCategoryButton;
       
        // Initial state of the game is game ended
        HangmanGame.setState(gameEnded);
        HangmanGame.setLetterCount();

        
    }

    public StartButton() {

    }

    public void act() 
    {
        this.state=HangmanGame.currentState;
        if(Greenfoot.mouseClicked(this)){
            HangmanGame.letterCount=0;
            Greenfoot.playSound("buttonClick.mp3");
            if (!animalCategoryButton.isAnimalBtnClicked() && !flowerCategoryButton.isFlowerBtnClicked() && !placesCategoryButton.isPlacesBtnClicked()) {
                System.out.println("Not Selected any Category");
                
                Message msg = new Message();
                    msg.setScale(180,20);
                    msg.drawMessage("Please select a category");
                    //Won_Message msg_won = new Won_Message();
                    startScreen.addObject(msg, 450, 300);
                //startScreen.addObject(selectMessage, 420, 230);
                Greenfoot.delay(60);
                startScreen.removeObject(msg);
            } else if (animalCategoryButton.isAnimalBtnClicked()){
                //WordList.clearWord();
                System.out.println("Clicked the Start Button after selecting animal category");
                WordList wordList  = animalCategoryButton.getWordList();   
                String word = wordList.getWord();
                if (word != null) {
                    
                    state.startButtonPressed(word);
                   
                } else {
                    System.out.println("DB is down");
                }
            }else if (flowerCategoryButton.isFlowerBtnClicked()){
                System.out.println("Clicked the Start Button after selecting flower category");
                WordList wordList  = flowerCategoryButton.getWordList();   
                String word = wordList.getWord();
                if (word != null) {
                   
                    state.startButtonPressed(word);
                   
                } else {
                    System.out.println("DB is down");
                }

            }else{
                System.out.println("Clicked the Start Button after selecting places category");
                WordList wordList  = placesCategoryButton.getWordList();   
                String word = wordList.getWord();
                if (word != null) {
                   
                   state.startButtonPressed(word);
                   
                } else {
                    System.out.println("DB is down");
                }

            }
        }
    }
}    

