package Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;

import Handler.Assets;
import States.TitleScreen;

public class GameTable extends Game {

	@Override
	public void create() {
		Assets.portal.load(new AssetManager());
		setScreen(new TitleScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		Assets.portal.dispose();
	}
}
