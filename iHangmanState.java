import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class iHangmanState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public interface iHangmanState 
{
    public void initScreen();
    public void keyPressed(String alphabet, World world);
    public void quit();
    public void startButtonPressed(String word);
    public void placeGuessedAlphabet(String alphabet, int[] arr, int size, String word, World world);
    public void reduceNoOfLives(World world);
}
