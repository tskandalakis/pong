package ninja.tasos.game.pong;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {

	public static int LEFT_SCORE = 0;
	public static int RIGHT_SCORE = 0;
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.drawString(Integer.toString(LEFT_SCORE), Game.WIDTH/2 - 20, 15);
		g.drawString(Integer.toString(RIGHT_SCORE), Game.WIDTH/2 + 5, 15);
	}
}
