package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.surreal.game.GameStateManager;

import Screens.GameTable;

public class TitleScreen extends GameStateManager{
	
//	private BitmapFont font;
	
	public TitleScreen(GameTable gameTable) {
		super(gameTable);
	}
	
	@Override
	public void show() {
		batch = new SpriteBatch();
		fontCam = new OrthographicCamera();
		fontCam.setToOrtho(false, GAME_WIDTH, GAME_HEIGHT);
		
//		font = font;
	}
	
	@Override
	public void update(float deltaTime) {
		if (Gdx.input.isKeyJustPressed(Keys.ENTER)) {
			changeScreen(GameState.START);
		}
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl20.glClearColor(11f/255.0f, 11f/255.0f, 11f/255.0f, 1);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(fontCam.combined);
		
		update(delta);
		
		batch.begin();
//		font.draw(batch, "SuReal", 120f, 350f);
		batch.end();
	}
}
