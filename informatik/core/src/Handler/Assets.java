package Handler;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Disposable;

public class Assets implements Disposable{

	public static Assets portal = new Assets();
	private final String IMAGE_PATH = "sprites/sprites.atlas";
	
	private AssetManager manager;
	private TextureAtlas atlas;
	
	private AtlasRegion slime, player;
	
	public Assets() {
		
	}
	
	public void load(AssetManager manager) {
		this.manager = manager;
		
		manager.load(IMAGE_PATH, TextureAtlas.class);
		manager.finishLoading();
		
		atlas = manager.get(IMAGE_PATH, TextureAtlas.class);
		
		slime = atlas.findRegion("slime");	
		
		player = atlas.findRegion("human");
		//TextureRegion[][] playerSprite = player.split(0, 0);
	}
	
	public AtlasRegion getSlime(){return slime;}
	
	@Override
	public void dispose() {
		manager.dispose();
	}

}
