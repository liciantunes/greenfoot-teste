import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flyn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flyn extends Actor
{
    GreenfootSound som2 = new GreenfootSound("som2.wav");
    
    public int speed = 3;
    private int sTimer = 0;
    private int tempo2 = 0;
    /**
     * Act - do whatever the flyn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    
     public void movimento(){
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed,this.getY());
        }
        if (Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed,this.getY());
        }
        else if (Greenfoot.isKeyDown("0") && (tempo2==0)){
            sTimer ++;
            som2.play();
            getWorld().addObject(new Poder(), getX() +20, getY() -30);
            tempo2++;
        }
        else{
        if (!Greenfoot.isKeyDown("0")){tempo2=0;}
        }
    }
}
