import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hangman extends World
{

    /**
     * Constructor for objects of class Hangman.
     * 
     */
    public Hangman()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        int xDash,yDash;
        xDash = 50;
        yDash = 99;
        
        int xARow,yARow;
        xARow = 50;
        yARow = 210; 

        for(int i = 0;i<4;i++)
        {
            Dash dash = new Dash();
            addObject(dash,xDash,yDash);
            dash.setLocation(xDash, yDash);
            xDash+=70;
        }

        A a = new A();
        addObject(a,xARow, yARow);
        a.setLocation(xARow, yARow);

        S s = new S();
        addObject(s, xARow+60, yARow);
        s.setLocation(xARow+60, yARow);

        D d = new D();
        addObject(d, xARow+60*2, yARow);
        d.setLocation(xARow+60*2, yARow);

        F f = new F();
        addObject(f,xARow+60*3, yARow);
        f.setLocation(xARow+60*3,yARow);

        H h = new H();
        addObject(h, xARow+60*4, yARow);
        h.setLocation(xARow+60*4, yARow);

        J j = new J();
        addObject(j,xARow+60*5,yARow);
        j.setLocation(xARow+60*5,yARow);

        K k = new K();
        addObject(k, xARow+60*6,yARow);
        k.setLocation(xARow+60*6,yARow);

        L l = new L();
        addObject(l,xARow+60*7,yARow);
        l.setLocation(xARow+60*7,yARow);

    }
}
