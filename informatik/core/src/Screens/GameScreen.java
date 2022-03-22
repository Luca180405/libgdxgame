package Screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.surreal.game.GameObject;
import com.surreal.game.GameStateManager;

import Entity.Enemy;
import Entity.Player;


public class GameScreen extends GameStateManager{
	private final String ID = getClass().getName();
	
	private GameTable gameTable;
	private OrthographicCamera camera;
	private Texture texture;
	private Sprite sprite;
	private float runTime;
	
	private Player player;
	private Enemy enemy;
	
	float maxVelocity = 100.0f;
	
	public GameScreen(GameTable gameTable) {
		super(gameTable);
		
		Gdx.app.log(ID, "This class is loaded!");
	}
	
	@Override
	public void show() {
		batch = new SpriteBatch();
		cam = new OrthographicCamera();
		cam.setToOrtho(false, 5f, 5f);
		
		player = new Player();
		enemy = new Enemy(3.5f);
		
		createGraphics();
	}
	
//	public void cameraUpdate() {
//		Vector3 position = camera.position;
//		position.x = object.pos.x;
//		position.x = object.pos.y;
//		camera.position.set(position);
//		camera.update();
//		
//	}
	
	private void createGraphics() {
		int width = 8;
		int height = 8;
		
		Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGB888);
		pixmap.setColor(Color.WHITE);
		pixmap.fill();
		pixmap.drawRectangle(0, 0, width, height);
		
		texture = new Texture(pixmap);
		
		sprite = new Sprite(texture);
		sprite.setPosition(1f, 1f);
		sprite.setSize(.5f, .5f);
	}
	
	private void handleInput() {
		if (Gdx.input.isKeyPressed(Keys.D)) {
			//move sprite 1 to right
			sprite.translate(1f, 0);
		}
		
		if (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE)) {
			Gdx.app.exit();
		}
	}
	
	@Override
	public void update(float deltaTime) {
		runTime += deltaTime;
		
		handleInput();
	}
 	
	@Override
	public void render(float deltaTime) {
		
		// Clear screen
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.setProjectionMatrix(camera.combined);
		
		update(deltaTime);
		
		batch.begin();
		sprite.draw(batch);
		player.render(batch);
		enemy.render(batch);
		batch.draw(texture, 1f, 1f, .5f, .5f);
		batch.end();
		
	}
	
	@Override
	public void dispose() {
		batch.dispose();
	}
	
	@Override
	public void resize(int width, int height) {
		
	}
	

}
