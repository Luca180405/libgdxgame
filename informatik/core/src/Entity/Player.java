package Entity;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g3d.model.Animation;
import com.badlogic.gdx.math.Vector2;
import com.surreal.game.GameObject;

import Handler.Assets;
import Screens.GameScreen;

public class Player extends GameObject{
	
	private com.badlogic.gdx.graphics.g2d.Animation playerAnimation;
	private float runTime;
	
	public Player() {
		pos.x = 1f;
		pos.y = 1f;
		dim.x = .5f;
		dim.y = .5f;
		
		playerAnimation = Assets.portal.getAnimation();
	}
	
	public void update(float deltaTime) {
		runTime += deltaTime;
	}
	
	public void render(SpriteBatch sb) {
		sb.draw((TextureRegion)playerAnimation.getKeyFrame(runTime), pos.x, pos.y, dim.x, dim.y);
	}
	
}
