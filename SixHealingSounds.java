package com.sixsounds.heal;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.I18NBundle;
import com.sixsounds.heal.AssetManager.Assets;
import com.sixsounds.heal.Screens.LiverScreen;

public class SixHealingSounds extends Game implements Disposable {
	// To be shared with the entire game.
	public SpriteBatch batch;

	// Store all the strings in one location to be accessed throughout the app.
	public I18NBundle languageStrings;

	// Preferences
	private AppPreferences mPreferences;

	// Screen Resolutions
	public static final float SCREEN_WIDTH = 1000;
	public static final float SCREEN_HEIGHT = 1000;

	// Screens
	LiverScreen mLiverScreen;

	public Assets mAssets;


	@Override
	public void create () {
		batch = new SpriteBatch();
		mAssets = new Assets();
		mLiverScreen = new LiverScreen(this);
		setScreen(mLiverScreen);

	}


	
	@Override
	public void dispose () {
		batch.dispose();
		mLiverScreen.dispose();
	}
}
