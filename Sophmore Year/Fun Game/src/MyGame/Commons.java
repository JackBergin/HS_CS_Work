package MyGame;
/*
 * This will have the general sizes for the display, and many other things
 */
public interface Commons 
{
    //All of this is the general dimensions of the 
    //imported images and the panel displaying the game:
    public static final int BOARD_WIDTH = 1000;//358
    public static final int BOARD_HEIGHT = 1000;
    public static final int GROUND = 990;//190
    
    public static final int ENEMY_HEIGHT = 50;
    public static final int ENEMY_WIDTH = 50;
    public static final int BORDER_RIGHT = 30;
    public static final int BORDER_LEFT = 5;
    //public static final int GO_DOWN = 17;//25
    public static final int MAX_NUMBER_OF_BADGUYS = 20;
    public static final int CHANCE = 5;
    public static final int DELAY = 5;
   
    //Defines the space filled by the player image
    //that can be hit by the bomb:
    public static final int PLAYER_WIDTH = 50;
    public static final int PLAYER_HEIGHT = 50;
}
