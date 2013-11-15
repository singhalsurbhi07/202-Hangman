import greenfoot.*;
/**
 * Write a description of class LetterNotGuessed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetterNotGuessed implements iHangmanState 
{
     private int x;
    
    /**
     * Constructor for objects of class LetterNotGuessed
     */
    public LetterNotGuessed()
    {
    }

    public void initScreen()
    {
        
    }
    
    public void keyPressed(String alphabet, World world)
    {
        
        //code to determine if the key pressed is correct or not
        //if correct -> change state to letter guessed        
        //if not correct -> change state to letter not guessed
        
        String wordFromDB = WordList.getWord();
      String  word = wordFromDB.toUpperCase();
        System.out.println("word is "+ word);
        int[] alphabetPosition = new int[word.length()];
        
        int index =0;
        int size = -1;
        int pos =0;
            for(int i=pos;i< word.length(); i ++){

                if((index =word.indexOf(alphabet, pos))!= -1){
                    System.out.println("inside if");
                     alphabetPosition[++size]= index;
                    pos=index+1;
                    System.out.println("index, size, pos : " + index + " "+ size + " " + pos );
                }
                else
                    break;
                
                
            }
                    
            if(size != -1){
               //placeGuessedAlphabet(alphabet, alphabetPosition, size+1,word, world);
                System.out.println("leter there");
                HangmanGame.setState(HangmanGame.getLetterGuessedState());
                iHangmanState state = HangmanGame.currentState;
                state.placeGuessedAlphabet(alphabet, alphabetPosition, size+1,word, world);
                //System.out.println("The filled number of letters are : " + letterCount);
                if(word.length()==HangmanGame.letterCount)
                {
                    System.out.println("Yayy!!!! You won!!!");
                    Message msg = new Message();
                    msg.setScale(120,40);
                    msg.drawMessage("Yay!!!\n You won!!!");
                    //Won_Message msg_won = new Won_Message();
                    world.addObject(msg, 800, 180);
                    Greenfoot.delay(100);
                    HangmanGame.setState(HangmanGame.getGameEndedState());
                    iHangmanState state1 = HangmanGame.currentState;
                    state1.initScreen();
                }
                
            }
            else
            {
                System.out.println("Letter is not present");
               
                   reduceNoOfLives(world);
                
            }
            
    }
   
    public void noLives()
    {
        
    }
    
    public void quit()
    {
        //code to quit the game
        HangmanGame.setState(HangmanGame.getGameEndedState());
        iHangmanState state = HangmanGame.currentState;
        state.initScreen();
    }
    
    public void gameWon()
    {
        
    }
    
    public void startButtonPressed(String word)
    {
        
    }
    
    public void reduceNoOfLives(World world)
    {
        //code to reduce the no of lives
                Lives lives = new Lives();
            
                int noOfLives = HangmanGame.updateNumberOfLives();
                System.out.println("Number of lives in wordtoguess after updation is : "+ noOfLives);
                
                lives.updateNoOfLives(world,noOfLives);
                 //check if all the lives are out, if yes, then change the state to game ended
                if(noOfLives==0)
                {
                     HangmanGame.setState(HangmanGame.getGameEndedState());
                    iHangmanState state = HangmanGame.currentState;
                    state.initScreen();
                }
                
        
        
       
    }
    
    public void placeGuessedAlphabet(String alphabet, int[] arr, int size, String word, World world){
       
     }
}
