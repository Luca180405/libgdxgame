package com.surreal.game;

import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import Handler.Constant;
import Screens.GameScreen;
import Screens.GameTable;
import States.TitleScreen;

public abstract class GameStateManager extends ScreenAdapter implements Constant{
	
	public SpriteBatch batch;
	public OrthographicCamera cam, fontCam;
	public GameTable gameTable;
	
	public enum GameState{
		TITLE,START,GAMEOVER
	};
	public GameState currentState;
	
	public GameStateManager(GameTable gameTable) {
		this.gameTable = gameTable;
		currentState = GameState.TITLE;
	}
	
	public abstract void update(float deltaTime);
	
	public void changeScreen(GameState state) {
		if (state == GameState.TITLE) {
			gameTable.setScreen(new TitleScreen(gameTable));
		} else if (state == GameState.START) {
			gameTable.setScreen(new GameScreen(gameTable));
		}
	}
}
