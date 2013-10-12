import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hangman extends World
{
    int xStart,yStart;
    WordToGuess wordtoguess;

    private String word;
    /**
     * Constructor for objects of class Hangman.
     * 
     */

    public Hangman(String word)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1); 
        this.word = word;
        xStart = 50;
        yStart = 100;

        createDash();
    }

    public  WordToGuess getWordToGuess()
    {
        return  wordtoguess;
    }

    private void createDash()
    {
        //w = new WordList();

        int xDash,yDash;
        xDash = xStart;
        yDash = yStart;

        setPaintOrder(VirtualKeyboard.class,ScoreCard.class,Title.class);
        System.out.println("The length of the word is " + word.length());

        
        System.out.println("The length of the word is " + word.length());

        for(int i = 0;i<word.length();i++)
        {
            Dash dash = new Dash();
            addObject(dash,xDash,yDash);
            dash.setLocation(xDash, yDash);
            xDash+=70;

        }

        addAlphabets(xStart,yStart+150);

        Title title = new Title();
        addObject(title, 132, 52);
        title.setLocation(114, 81);
        wordtoguess = new WordToGuess();
        addObject(wordtoguess, 661, 77);
        wordtoguess.setLocation(609, 151);

        wordtoguess.setLocation(862, 217);
        wordtoguess.setLocation(844, 224);
    }

    public void addAlphabets(int x, int y) {
        int xQRow,yQRow;
        xQRow = x;
        yQRow = y; 

        int xARow, yARow;
        xARow = x+60;
        yARow = y+60; 

        int xZRow,yZRow;
        xZRow = 2*x + x/2 + 10;
        yZRow = y+120;

        addQRow(xQRow,yQRow);
        addARow(xARow,yARow);
        addZRow(xZRow,yZRow);

    }

    public void addQRow(int x,int y)
    {
//         Q q = new Q();
//         addObject(q,x, y);
//         q.setLocation(x, y);
// 
//         W w = new W();
//         addObject(w, x+60, y);
//         w.setLocation(x+60, y);
// 
//         E e = new E();
//         addObject(e, x+60*2, y);
//         e.setLocation(x+60*2, y);
// 
//         R r = new R();
//         addObject(r,x+60*3, y);
//         r.setLocation(x+60*3,y);
// 
//         T t = new T();
//         addObject(t, x+60*4, y);
//         t.setLocation(x+60*4, y);
// 
//         Y yy = new Y();
//         addObject(yy,x+60*5,y);
//         yy.setLocation(x+60*5,y);
// 
//         U u = new U();
//         addObject(u, x+60*6,y);
//         u.setLocation(x+60*6,y);
// 
//         I i = new I();
//         addObject(i,x+60*7,y);
//         i.setLocation(x+60*7,y);
// 
//         O o = new O();
//         addObject(o,x+60*8,y);
//         o.setLocation(x+60*8,y);
// 
//         P p = new P();
//         addObject(p,x+60*9,y);
//         p.setLocation(x+60*9,y);
    }

    
    public void addARow(int x,int y)
    {
        A a = new A();
        addObject(a,x, y);
        a.setLocation(x, y);

        S s = new S();
        addObject(s, x+60, y);
        s.setLocation(x+60, y);

        D d = new D();
        addObject(d, x+60*2, y);
        d.setLocation(x+60*2, y);

        F f = new F();
        addObject(f,x+60*3, y);
        f.setLocation(x+60*3,y);

        H h = new H();
        addObject(h, x+60*4, y);
        h.setLocation(x+60*4, y);

        J j = new J();
        addObject(j,x+60*5,y);
        j.setLocation(x+60*5,y);

        K k = new K();
        addObject(k, x+60*6,y);
        k.setLocation(x+60*6,y);

        L l = new L();
        addObject(l,x+60*7,y);
        l.setLocation(x+60*7,y);
    }

    public void addZRow(int x,int y)
    {
//         Z z = new Z();
//         addObject(z,x, y);
//         z.setLocation(x, y);
// 
//         X xx = new X();
//         addObject(xx, x+60, y);
//         xx.setLocation(x+60, y);
// 
//         C c = new C();
//         addObject(c, x+60*2, y);
//         c.setLocation(x+60*2, y);
// 
//         V v = new V();
//         addObject(v,x+60*3, y);
//         v.setLocation(x+60*3,y);
// 
//         B b = new B();
//         addObject(b, x+60*4, y);
//         b.setLocation(x+60*4, y);
// 
//         N n = new N();
//         addObject(n,x+60*5,y);
//         n.setLocation(x+60*5,y);
// 
//         M m = new M();
//         addObject(m, x+60*6,y);
//         m.setLocation(x+60*6,y);

    }

}

