package Entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.surreal.game.GameObject;

import Handler.Assets;

public class Enemy extends GameObject{

	public Enemy(float x) {
		pos.x = x;
		pos.y = 1f;
		dim.x = .5f;
		dim.y = .5f;
		
		sprite = new Sprite(Assets.portal.getSlime());
		sprite.setPosition(pos.x, pos.y);
		sprite.setSize(dim.x, dim.y);
	}
	
	public void update(float deltaTime) {
		
	}
	
	public void render(SpriteBatch batch) {
		sprite.draw(batch);
	}
}
