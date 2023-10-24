import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mundo here.
 * 
 * @author Alicie
 * @version 0.1 Alpha
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musica.mp3");

    public void started()
    {
        bgMusic.playLoop();
    }
    
    public void stopped()
    {
        bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class Mundo.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        flyn flyn = new flyn();
        addObject(flyn,63,431);
        rapunzel rapunzel = new rapunzel();
        addObject(rapunzel,672,143);
        camaleao camaleão = new camaleao();
        addObject(camaleão,768,564);
        rapunzel.setLocation(731,483);
        rapunzel.setLocation(515,397);
        flyn.setLocation(327,379);
        rapunzel.setLocation(473,391);
        rapunzel.setLocation(529,326);
        flyn.setLocation(377,335);
        flyn.setLocation(307,349);
        rapunzel.setLocation(472,358);
        Counter counter = new Counter();
        addObject(counter,114,74);
        Counter2 counter2 = new Counter2();
        addObject(counter2,653,79);
    }
}
