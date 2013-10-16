import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WordToGuess here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordToGuess extends Actor
{
    /**
     * Act - do whatever the WordToGuess wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  //private String alphabetGuessed;
  private String word;  
  private int indexOfAlphabet;
  World world;
  int letterCount;
  Lives lives = new Lives();
  //private int noOfLives=5;
 
  
  public WordToGuess(){
      
      indexOfAlphabet =0;
  }
  
    public void act() 
    {
        // Add your action code here.
    }    
   

    
    public void setAlphabetGuessed(String alphabet, World w)
    {
        
        System.out.println("User guessed "+ alphabet);
        world =w;
        //word = WordList.getWord();
        checkForLetterInString(alphabet);
        
    }
    
    private void placeGuessedAlphabet(String alphabet, int[] arr, int size){
         int xAlpha, yAlpha, j;
         
         xAlpha =50;
         yAlpha = 100 ;
         
         j=0;

         for(int i=0; (i<word.length())&&(size > 0); i++)
         {
             if(arr[j]== i){
                
                System.out.println("inside draw");
                letterCount = Quit.updateLetterCount();
               // System.out.println("The filled number of letters are : " + letterCount);
                Message message = new Message(alphabet);
                world.addObject(message, xAlpha,yAlpha-20);
                j++;
                size--;
            }
                
             xAlpha+=70;
         }
     }
    
    private void checkForLetterInString(String alphabet){
        
       String wordFromDB = WordList.getWord();
       word = wordFromDB.toUpperCase();
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
                placeGuessedAlphabet(alphabet, alphabetPosition, size+1);
                System.out.println("leter there");
                System.out.println("The filled number of letters are : " + letterCount);
                if(word.length()==letterCount)
                {
                    System.out.println("Yayy!!!! You won!!!");
                    Won_Message msg_won = new Won_Message();
                    world.addObject(msg_won, 800, 180);
                    Greenfoot.delay(100);
                    Greenfoot.setWorld(new StartScreen());
                }
                
            }
            else
            {
                System.out.println("Letter is not present");
                calculateLives();
                
            }
        }
        
        public void calculateLives()
        {
                int noOfLives = NumberOfLives.updateNumberOfLives();
                System.out.println("Number of lives in wordtoguess after updation is : "+ noOfLives);
                if(noOfLives>=0)
                lives.updateNoOfLives(world,noOfLives);
              
        }
    }
    

