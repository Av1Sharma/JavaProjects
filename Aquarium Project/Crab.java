import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab extends Actor
{
    private boolean walkingRight = true;
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( walkingRight == true)
        {
            move(16);
        }
        else
        {
            move(-16);
        }
        if(isAtEdge())
        {
            walkingRight = !walkingRight;
        }
    }    
}
