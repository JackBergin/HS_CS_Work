package MyGame;

	import javax.swing.ImageIcon;

	public class MyBouncingEnemy extends GameSprite 
	{
	   //FEILDS:
	   //inserts the alien image
	   private final String alienImg = "alien.png";

	   public MyBouncingEnemy(int x, int y) 
	   {
	      //gives the alien the coordinates
	      initAlien(x, y);
	   }

	   private void initAlien(int x, int y) 
	   {
	   
	      this.x = x;
	      this.y = y;
	      //bomb coordinates	        
	      ImageIcon ii = new ImageIcon(alienImg);
	      //sets the image 
	      setImage(ii.getImage());
	   }

	   public void act(int direction) 
	   {
	      //Initalizes direction and keeps 
	      //the direction when the key listener is initialized
	      this.x += direction;
	   }

}
