package com.sixsounds.heal.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.sixsounds.heal.Actors.LiverActor2;
import com.sixsounds.heal.AssetManager.AnimationAssets;
import com.sixsounds.heal.SixHealingSounds;

/**
 * Created by Agnel on 16/02/18.
 */

public class LiverScreen implements Screen {

    SixHealingSounds mSixHealingSounds;
    Stage liverStage;
    OrthographicCamera mCamera;
    // Use FitViewport cause the clear screen will be the desired color so it will blend.
    FitViewport mViewport;
    Image testImage;
    float mStatetime;
    AnimationAssets mAnimationAssets;
    LiverActor2 mLiverActor2;


   // Create the constructor so we can pass in the game to be used throughout the screen.

   public LiverScreen(SixHealingSounds sixHealingSounds){
       mSixHealingSounds = sixHealingSounds;
       mCamera = new OrthographicCamera();
       mViewport = new FitViewport(mSixHealingSounds.SCREEN_WIDTH,mSixHealingSounds.SCREEN_HEIGHT,mCamera);
       liverStage = new Stage(mViewport,mSixHealingSounds.batch);
       mAnimationAssets = new AnimationAssets();
       mAnimationAssets.populateAnimations();
       mLiverActor2 = new LiverActor2(mAnimationAssets);
   }



    @Override
    public void show() {
        mStatetime = 0f; // Add mStatetime to keep track of time.
       testImage = new Image(new Texture("badlogic.jpg")); //Test to see if the stage works.
       liverStage.addActor(testImage);
        liverStage.addActor(mLiverActor2);

    }

    @Override
    public void render(float delta) {
       // Clear the screen so that previously rendered image don't remain.
            Gdx.gl.glClearColor(1, 0, 0, 1);
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
            mStatetime += Gdx.graphics.getDeltaTime(); // Add the passing time for displaying the animations.
        // Draw the stage and pass in the state time for the actors to act.
            liverStage.draw();
            liverStage.act(mStatetime);
    }

    @Override
    public void resize(int width, int height) {
        liverStage.getViewport().update(width,height); // Resize according to the changes in the screen.
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
    liverStage.dispose();
    }
}
