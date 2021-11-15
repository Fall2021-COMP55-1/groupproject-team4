import acm.graphics.*;
import acm.graphics.GImage;
import acm.graphics.GOval;

public class Bullet extends Entity{
	double dy; //velocity
	int damage;
	GImage sprite;
	GOval tempSprite;


	public Bullet(double x, double y, double dy, int damage){
		this.x = x;
		this.y = y;
		this.dy = dy;
		this.damage = damage;
		isdead = false;
		
		tempSprite = new GOval(x,y,50,50);

	}
		
	public void update() {
		//updates position
		
		y += dy;
		tempSprite.move(0, dy);
		
		//check collision with hitbox
	}
	

	public String toString() {
		String s = new String();
		s += x + " " + y + " " + dy + " " + damage;
					 
		return s;
	}

}
