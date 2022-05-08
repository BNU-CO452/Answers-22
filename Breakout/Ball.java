import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Move the ball around the screen using the 
 * inbuilt tutrle graphics.  Ball has a chosen 
 * image.
 * 
 * @author Derek Peacock 
 * @version 0
 */
public class Ball extends Actor
{
    private int speed = 5;
    private int angle = 45;
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        
        if(isAtEdge()) 
        {
            //angle = -angle; 
            turn(-angle);
            
        }
    }
}
