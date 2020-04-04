package ninja.tasos.game.pong;

import java.awt.Color;
import java.awt.Graphics;

public class Board {

	public void render(Graphics g) {
		g.setColor(Color.white);
		g.drawRect(Game.WIDTH /2, 0, 1, Game.HEIGHT);
	}
}
