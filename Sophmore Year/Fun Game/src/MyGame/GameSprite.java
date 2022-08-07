package MyGame;

/*
Has the basic starting requirements 
for any sprite in this program. 
*/

import java.awt.Image;

public class GameSprite 
{
    //FEILDS:
    private boolean visible;
    private Image image;
    protected int x;
    protected int y;
    protected boolean dying;
    protected int dx;

    public GameSprite() {visible = true;}
    //You can see the sprite because of this, this 
    //initializes the sprite to be visible in the first place.

    public void die() {visible = false;}
    //When hit by either a bomb or a bullet the sprite will become invisible 

    public boolean isVisible() {return visible;}

    protected void setVisible(boolean visible) {this.visible = visible;}
    //If visible then true, if it's false and 
    //is not visible then it will be set to invisible.

    public void setImage(Image image) {this.image = image;}

    public Image getImage() {return image;}
    //Sets the image for every sprite

    public void setX(int x) {this.x = x;}
    //Sets the x place for the sprite
   
    public void setY(int y) {this.y = y;}
    //Sets the y place for the sprite
    
    public int getY() {return y;}
    //In order to move the sprite it needs to 
    //know what the y value it for its height on the y plane.
    
    public int getX() {return x;}
    //In order to move the sprite it needs to 
    //know what the x value it for its place on the x plane.
    
    public void setDying(boolean dying) {this.dying = dying;}
    //If dying is set then the sprite will be set to invisible.
    
    public boolean isDying() {return this.dying;}
    //Is dying will do the same thing but as a 
    //return method, addressing other aspects of this program.
}