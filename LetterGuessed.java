import greenfoot.*;
/**
 * Write a description of class LetterGuessed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LetterGuessed implements iHangmanState 
{
     private int x;
    /**
     * Constructor for objects of class LetterGuessed
     */
    public LetterGuessed()
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
               placeGuessedAlphabet(alphabet, alphabetPosition, size+1,word, world);
                System.out.println("leter there");
                //check if all dashes are filled , if yes, then change state to game ended
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
                    iHangmanState state = HangmanGame.currentState;
                    state.initScreen();
                   // Greenfoot.setWorld(new StartScreen());
                }
                
            }
            else
            {
                System.out.println("Letter is not present");
                HangmanGame.setState(HangmanGame.getLetterNotGuessedState());
                iHangmanState state = HangmanGame.currentState;
                state.reduceNoOfLives(world);
              
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
    public void fillDashes()
    {
       
        
        
    }
    
    public void placeGuessedAlphabet(String alphabet, int[] arr, int size, String word, World world){
         //code to fill in the dashes with the alphabet
        int xAlpha, yAlpha, j;
         
         xAlpha =50;
         yAlpha = 100 ;
         
         j=0;

         for(int i=0; (i<word.length())&&(size > 0); i++)
         {
             if(arr[j]== i){
                
                System.out.println("inside draw");
                HangmanGame.updateLetterCount();
                System.out.println("The filled number of letters are : " + HangmanGame.letterCount);
                
               Message message = new Message();
                message.setScale(25,25);
                message.setMessageStart(5,15);
                message.drawMessage(alphabet);
                world.addObject(message, xAlpha,yAlpha-20);
                j++;
                size--;
            }
                
             xAlpha+=70;
         }
     }
     
     public void reduceNoOfLives(World world)
     {
        
     }
}
