package ninja.tasos.game.pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject {

	Handler handler;

	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}
	
	public void tick() {
		//x += velX;
		y += velY;
		
		//x = Game.clamp(x, 0, Game.WIDTH -37);
		y = Game.clamp(y, 0, Game.HEIGHT - 60);
	}
	
	public void render(Graphics g) {
		if(id == ID.Player) g.setColor(Color.white);
		if(id == ID.Player2) g.setColor(Color.blue);
		
		g.fillRect(x, y, 32, 32);
	}
}
