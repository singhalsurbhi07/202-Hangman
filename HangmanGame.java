import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HangmanGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HangmanGame
{
    static iHangmanState currentState;
    static int letterCount;
    static int noOfLives;
    
    public static void setNoOfLives(int no)
    {
        noOfLives=no;
    }
    
     public static void setState(iHangmanState state)
    {
        currentState = state;
    }
    
    public static void setLetterCount()
    {
        letterCount=0;
    }
    
     public static int updateLetterCount()
    {
        letterCount++;
        return letterCount;
    }
    
    public static int updateNumberOfLives()
{
    noOfLives--;
    return noOfLives;
    
}

public static iHangmanState getGameStartedState()
{
    return new GameStarted();
}

public static iHangmanState getGameEndedState()
{
    return new GameEnded();
}
public static iHangmanState getLetterGuessedState()
{
    return new LetterGuessed();
}
public static iHangmanState getLetterNotGuessedState()
{
    return new LetterNotGuessed();
}
}
