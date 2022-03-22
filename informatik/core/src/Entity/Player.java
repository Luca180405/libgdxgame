package Entity;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.surreal.game.GameObject;

public class Player extends GameObject{
	
	private Vector2 velocity = new Vector2();
	private float speed = 60*2;
	
	
	public Player() {
		pos.x = 1f;
		pos.y = 1f;
		dim.x = .5f;
		dim.y = .5f;
		
		color = Color.DARK_GRAY;
		createGraphics();
		
		sprite.setPosition(pos.x, pos.y);
		sprite.setSize(dim.x, dim.y);
	}
	
	public void update(float deltaTime) {
		
	}
	
	public void render(SpriteBatch sb) {
		sprite.draw(sb);
	}
	
}
