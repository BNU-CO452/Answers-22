import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Move the ball around the screen using the 
 * inbuilt tutrle graphics.  Ball has a chosen 
 * image.
 * 
 * @author Derek Peacock 
 * @version 0
 */
public class Ball extends ShapeSprite
{
    private int speed = 5;
    
    // Current velocity change in x and y
    
    private int dx;
    private int dy;
    
    public Ball(int width, int height)
    {
        super(Shapes.Oval, width, height);
        
        dx = speed; dy = speed;
        turn(45);
    }
    
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World world = getWorld();
        int x = getX(); int y = getY();
        
        if(x >= world.getWidth() - width) 
        {
            dx = -speed; 
        }
        
        if(y >= world.getHeight() - height)
        {
            dy = -speed;
        }
        
        if(x <= 0)
        {
            dx = 0;
            dy = 0;
        }
        
        if(y <= 0)
        {
            dy = speed;
        }
        
        
        if(getOneIntersectingObject(Paddle.class)!=null)
        {
            dx = speed;
        }
        
        setLocation(x + dx, y + dy);
    }
}
