package com.surreal.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import Handler.Constant;
import Screens.GameTable;

public class DesktopLauncher implements Constant{
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.vSyncEnabled = true;
		config.title = "suReal - A surreal Game";
		config.width = GAME_WIDTH;
		config.height = GAME_HEIGHT;
		new LwjglApplication(new GameTable(), config) ;
	}
}
