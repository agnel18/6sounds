package com.sixsounds.heal.Actors;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.sixsounds.heal.AssetManager.AnimationAssets;

/**
 * Created by Agnel on 17/02/18.
 */

public class LiverActor2 extends Actor {
    AnimationAssets mAnimationAssets;
    float liverTime;
    TextureRegion fullofgrace;

    public LiverActor2(AnimationAssets assets) {
        mAnimationAssets = assets;
        liverTime = 0f;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        liverTime += delta;
        fullofgrace = mAnimationAssets.liverBodyInitiationAn.getKeyFrame(liverTime);
    }


    @Override
    public void draw(Batch batch, float parentAlpha) {
        {
            super.draw(batch, parentAlpha);
            batch.draw(fullofgrace, getX(), getY());
        }
    }
}
