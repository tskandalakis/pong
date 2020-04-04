package ninja.tasos.game.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Ball extends GameObject {

	Handler handler;
	
	public Ball(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		
		velY = 5;
		velX = 5;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 16, 16);
	}
	
	private void collision() {
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player || tempObject.getId() == ID.Player2) {
				if(getBounds().intersects(tempObject.getBounds())) {
					//collision code
					velY *= -1;
					velX *= -1;
				}
			}
		}
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 32) velY *= -1;
		if(x <= 0) {
			velX *= -1;
			HUD.RIGHT_SCORE++;
		} else if(x >= Game.WIDTH - 32) {
			velX *= -1;
			HUD.LEFT_SCORE++;
		}
		
		this.collision();
	}

	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, 16, 16);
	}
}
