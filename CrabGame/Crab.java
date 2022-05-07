import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MovingSprite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    protected int width;
    protected int height;
    
    protected int speed = 2;
    protected int turnAngle = 4;
    
    protected GreenfootImage image;
    
    public Crab()
    {
        image = getImage();
        //image.scale(40, 25);
        
        width = image.getWidth();
        height = image.getHeight();
        
        setRotation(90);
    }
    
    /**
     * Act - do whatever the MovingSprite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move4Ways();
    }
    
    public void moveAndTurn()
    {
        int x = getX(); int y = getY();
        int halfWidth = width / 2;
        
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-turnAngle);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(turnAngle);
        }  
        
        move(speed);
    }
    
    /**
     * This method moves the paddle around in four directions
     * left, right, up and down using coordinate positions.  
     */
    public void move4Ways()
    {
        int x = getX(); int y = getY();
        int halfWidth = width / 2;
        
        if(Greenfoot.isKeyDown("left") && x > halfWidth)
        {
            setRotation(270);
            x -= speed;
        }
        
        if(Greenfoot.isKeyDown("right") && !isAtEdge())
        {
            setRotation(90);
            x += speed;
        }        
        
        if(Greenfoot.isKeyDown("down") && !isAtEdge())
        {
            setRotation(180);
            y += speed;
        } 
        
        if(Greenfoot.isKeyDown("up") && y > speed)
        {
            setRotation(0);
            y -= speed;
        }
        
        setLocation(x, y);
    }
}
