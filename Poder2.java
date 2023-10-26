import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poder2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poder2 extends Actor
{
    public int temp = 30;
    /**
     * Act - do whatever the Poder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       public void act()
    {
        moveAtaque();
        acertarAlvo();
    }
    
    public void acertarAlvo() {
        
        Actor c = getOneIntersectingObject(flyn.class);
        
        if (c != null) {
            
            Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter2.add(1);
            temp = 0;
            getWorld().removeObject(c);
            getWorld().removeObject(this);
            
        }
        if(temp < 1){
        rapunzel_venceu world = new rapunzel_venceu();
        Greenfoot.setWorld(world);
            }
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
    
        
        setLocation(x, y);
        
    }
}
