package com.sixsounds.heal.AssetManager;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.Arrays;

/**
 * Created by Agnel on 17/02/18.
 */
// Create class to seperate the creation of the animation instance and use them when required.
public class AnimationAssets {
    TextureAtlas mTextureAtlas;
    TextureRegion[] liverBodyInitiation;
    public Animation<TextureRegion> liverBodyInitiationAn;


    public void populateAnimations(){
        mTextureAtlas = new TextureAtlas("world assets/World.atlas");

        // Initiation Animation
        liverBodyInitiation = new TextureRegion[10];

        for (int n = 0; n < liverBodyInitiation.length; n++) {

            liverBodyInitiation[n] = mTextureAtlas.findRegion("b3li", n);
            System.out.println(Arrays.toString(liverBodyInitiation));
        }
        liverBodyInitiationAn = new Animation<TextureRegion>(0.3f,liverBodyInitiation);
        liverBodyInitiationAn.setPlayMode(Animation.PlayMode.LOOP);
    }



}
