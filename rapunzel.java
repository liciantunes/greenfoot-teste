import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class rapunzel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rapunzel extends Actor
{
    GreenfootSound som = new GreenfootSound("som.wav");
    
    public int speed = 3;
    private int sTimer = 0;
    private int tempo = 0;
    /**
     * Act - do whatever the rapunzel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    
    public void movimento(){
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed,this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed,this.getY());
        }
        else if (Greenfoot.isKeyDown("f") && (tempo==0)){
            sTimer ++;
            som.play();
            getWorld().addObject(new Poder2(), getX() -20, getY() +30);
            tempo++;
        }
        else{
        if (!Greenfoot.isKeyDown("f")){tempo=0;}
        }
    }
    
}
