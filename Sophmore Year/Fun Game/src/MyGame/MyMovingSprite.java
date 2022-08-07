package MyGame;
	import java.awt.event.KeyEvent;

	import javax.swing.ImageIcon;

	public class MyMovingSprite extends GameSprite implements Commons 
	{
	    private final int START_Y = 50; //280
	    private final int START_X = 50; //280

	    private final String playerImg = "Player.png";
	    private int width;

	    public MyMovingSprite() 
	    {
	        initPlayer();
	    }

	    private void initPlayer() 
	    {
	        //Sets the image of the player given in the string playerImg
	        ImageIcon playerImage = new ImageIcon(playerImg);
	        
	        //width = playerImage.getImage().getWidth(null);
	        //Sets the ImageIcon
	        setImage(playerImage.getImage());
	        //Starting point of the player located in the commons
	        setX(START_X);
	        setY(START_Y);
	    }

	    public void act() 
	    {
	        x += dx;
	        
	        if (x <= 2) 
	        {
	            x = 2;
	        }
	        
	        if (x >= BOARD_WIDTH - 2 * width) 
	        {
	            x = BOARD_WIDTH - 2 * width;
	        }
	    }
	    
	    //Moves the player sprite
	    public void keyPressed(KeyEvent e) 
	    {    
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {dx = -2;}

	        if (key == KeyEvent.VK_RIGHT) {dx = 2;}
	    }
	    //When there is no key pressed the dx and dy 
	    //position have revert back to zero and this 
	    //is the mathod that does such
	    public void keyReleased(KeyEvent e) 
	    {    
	        int key = e.getKeyCode();

	        if (key == KeyEvent.VK_LEFT) {dx = 0;}

	        if (key == KeyEvent.VK_RIGHT) {dx = 0;}
	    }
	}


