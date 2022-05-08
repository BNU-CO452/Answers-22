import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Move the paddle in four directions, up, down
 * left and right with the arrow keys
 * 
 * @author Derek Peacock
 * @version 0
 */
public class Paddle extends Actor
{
    protected int width;
    protected int height;
    protected int speed = 4;
    
    protected GreenfootImage image;
    
    /**
     * Create a blue rectangle using a Greenfoot Image
     * 
     */
    public Paddle(int width, int height)
    {
        this.width = width;
        this.height = height;
        
        image = new GreenfootImage(width, height);
        image.setColor(Color.RED);
        image.fill();
        setImage(image);
    }
    
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveWithKeys();
    }
    
    /**
     * This method moves the paddle around in four directions
     * using coordinate positions.  Could use turtle graphics 
     * instead without x,y coordinates.
     */
    public void moveWithKeys()
    {
        int x = getX(); int y = getY();
        int halfWidth = width / 2;
        
        if(Greenfoot.isKeyDown("left") && x > halfWidth)
        {
            x -= speed;
        }
        
        if(Greenfoot.isKeyDown("right") && !isAtEdge())
        {
            x += speed;
        }        
        
        if(Greenfoot.isKeyDown("down") && !isAtEdge())
        {
            y += speed;
        } 
        
        if(Greenfoot.isKeyDown("up") && y > speed)
        {
            y -= speed;
        }
        
        setLocation(x, y);
    }
    
 
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
