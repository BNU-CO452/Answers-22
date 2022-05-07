import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    private Crab crab;
    private Lobster lobster;
    
    private Worm[] worms;
    private int wormSize;
    private Random generator;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        crab = new Crab();
        addObject(crab, 200, 200);
        
        lobster = new Lobster();
        addObject(lobster, 600, 400);
        
        worms = new Worm[100];
        generator = new Random();
        
        wormSize = 30;
        addWorms();
    }
    
    public void addWorms()
    {
        for(int index = 0; index < 20; index++)
        {
            createWorm(index);
        }
    }
    
    private void createWorm(int number)
    {
        Worm worm = new Worm();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
        if(x < wormSize) x = wormSize;
        if(x > getWidth() - wormSize) x = getWidth() - wormSize;
        
        if(y < wormSize) y = wormSize;
        if(y > getHeight() - wormSize) y = getHeight() - wormSize;
        
        addObject(worm, x, y);
    }
}
