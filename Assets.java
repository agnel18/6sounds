package com.sixsounds.heal.AssetManager;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetErrorListener;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Disposable;
import com.sixsounds.heal.SixHealingSounds;

/**
 * Created by Agnel on 15/02/18.
 */

public class Assets implements Disposable{
    // Create an asset manager to handle all the textures, sounds, fonts, etc.
    public AssetManager mManager = new AssetManager();

    // World Atlas.
    public final String WorldAtlas = "world assets/World.atlas";

    // Sounds
    // Heart Sounds
    public final String h01_initiation_heart = "audio/heart/h01_initiation_heart_audio.mp3";
    public final String h02_look_deep_heart = "audio/heart/h02_look_deep_heart_audio.mp3";
    public final String h03_look_for_hatred_heart = "audio/heart/h03_look_for_hatred_heart_audio.mp3";
    public final String h04_impatience_emotion_heart = "audio/heart/h04_impatience_emotion_heart_audio.mp3";
    public final String h05_arrogance_emotion_heart = "audio/heart/h05_arrogance_emotion_heart_audio.mp3";
    public final String h06_pride_emotion_heart = "audio/heart/h06_pride_emotion_heart_audio.mp3";
    public final String h07_turn_it_up_heart = "audio/heart/h07_turn_it_up_heart_audio.mp3";
    public final String h08_heart_sound_heart = "audio/heart/h08_heart_sound_heart_audio.mp3";
    public final String h09_bring_it_down_heart = "audio/heart/h09_bring_it_down_heart_audio.mp3";
    public final String h10_bring_in_the_positive_heart = "audio/heart/h10_bring_in_the_positive_heart_audio.mp3";
    public final String h11_joy_heart = "audio/heart/h11_joy_heart_audio.mp3";
    public final String h12_happiness_heart = "audio/heart/h12_happiness_heart_audio.mp3";
    public final String h13_patience_heart = "audio/heart/h13_patience_heart_audio.mp3";
    public final String h14_humility_heart = "audio/heart/h14_humility_heart_audio.mp3";
    public final String h15_respect_heart = "audio/heart/h15_respect_heart_audio.mp3";
    public final String h16_gratitude_heart = "audio/heart/h16_gratitude_heart_audio.mp3";
    public final String h17_shut_it_down_heart = "audio/heart/h17_shut_it_down_heart_audio.mp3";

    // Kidney Sounds

    public final String k01_initiation_kidney = "audio/kidneys/k01_initiation_kidney_audio.mp3";
    public final String k02_rubbing_kidney = "audio/kidneys/k02_rubbing_kidney_audio.mp3";
    public final String k03_initiation_0_kidney = "audio/kidneys/k03_initiation_0_kidney_audio.mp3";
    public final String k04_look_deep_kidney = "audio/kidneys/k04_look_deep_kidney_audio.mp3";
    public final String k05_look_for_fear_kidney = "audio/kidneys/k05_look_for_fear_kidney_audio.mp3";
    public final String k06_trauma_emotion_kidney = "audio/kidneys/k06_trauma_emotion_kidney_audio.mp3";
    public final String k07_phobia_emotion_kidney = "audio/kidneys/k07_phobia_emotion_kidney_audio.mp3";
    public final String k08_apathy_emotion_kidney = "audio/kidneys/k08_apathy_emotion_kidney_audio.mp3";
    public final String k09_despair_emotion_kidney = "audio/kidneys/k09_despair_emotion_kidney_audio.mp3";
    public final String k10_cowardice_emotion_kidney = "audio/kidneys/k10_cowardice_emotion_kidney_audio.mp3";
    public final String k11_turn_it_up_kidney = "audio/kidneys/k11_turn_it_up_kidney_audio.mp3";
    public final String k12_kidney_sound_kidney = "audio/kidneys/k12_kidney_sound_kidney_audio.mp3";
    public final String k13_bring_it_back_kidney = "audio/kidneys/k13_bring_it_back_kidney_audio.mp3";
    public final String k14_bring_in_the_positive_kidney = "audio/kidneys/k14_bring_in_the_positive_kidney_audio.mp3";
    public final String k15_acceptance_emotion_kidney = "audio/kidneys/k15_acceptance_emotion_kidney_audio.mp3";
    public final String k16_willingness_emotion_kidney = "audio/kidneys/k16_willingness_emotion_kidney_audio.mp3";
    public final String k17_peace_emotion_kidney = "audio/kidneys/k17_peace_emotion_kidney_audio.mp3";
    public final String k18_stillness_emotion_kidney = "audio/kidneys/k18_stillness_emotion_kidney_audio.mp3";
    public final String k19_love_emotion_emotion_kidney = "audio/kidneys/k19_love_emotion_emotion_kidney_audio.mp3";
    public final String k20_hope_emotion_kidney = "audio/kidneys/k20_hope_emotion_kidney_audio.mp3";
    public final String k21_shut_it_down_kidney = "audio/kidneys/k21_shut_it_down_kidney_audio.mp3";

    // Liver Sounds

    public final String l01_initiation_liver = "audio/liver/l01_initiation_liver_audio.mp3";
    public final String l02_look_deep_liver = "audio/liver/l02_look_deep_liver_audio.mp3";
    public final String l03_look_for_anger_liver = "audio/liver/l03_look_for_anger_liver_audio.mp3";
    public final String l04_frustration_liver = "audio/liver/l04_frustration_liver_audio.mp3";
    public final String l05_envy_liver = "audio/liver/l05_envy_liver_audio.mp3";
    public final String l06_jealousy_liver = "audio/liver/l06_jealousy_liver_audio.mp3";
    public final String l07_desire_emotion_liver = "audio/liver/l07_desire_emotion_liver_audio.mp3";
    public final String l08_guilt_liver = "audio/liver/l08_guilt_liver_audio.mp3";
    public final String l09_turn_it_up_liver = "audio/liver/l09_turn_it_up_liver_audio.mp3";
    public final String l10_liver_sound_liver = "audio/liver/l10_liver_sound_liver_audio.mp3";
    public final String l11_bring_it_down_liver = "audio/liver/l11_bring_it_down_liver_audio.mp3";
    public final String l12_bring_in_the_positive_liver = "audio/liver/l12_bring_in_the_positive_liver_audio.mp3";
    public final String l13_kindness_emotion_liver = "audio/liver/l13_kindness_emotion_liver_audio.mp3";
    public final String l14_generosity_emotion_liver = "audio/liver/l14_generosity_emotion_liver_audio.mp3";
    public final String l15_forgiveness_emotion_liver = "audio/liver/l15_forgiveness_emotion_liver_audio.mp3";
    public final String l16_appreciation_emotion_liver = "audio/liver/l16_appreciation_emotion_liver_audio.mp3";
    public final String l17_self_worth_emotion_liver = "audio/liver/l17_self_worth_emotion_liver_audio.mp3";
    public final String l18_shut_it_down_emotion_liver = "audio/liver/l18_shut_it_down_liver_emotion.mp3";


    // Lungs Sounds

    public final String u01_initiation_lung = "audio/lungs/u01_initiation_lung_audio.mp3";
    public final String u02_look_deep_lung = "audio/lungs/u02_look_deep_lung_audio.mp3";
    public final String u03_depression_emotion_lung = "audio/lungs/u03_depression_emotion_lung_audio.mp3";
    public final String u04_sorrow_emotion_lung = "audio/lungs/u04_sorrow_emotion_lung_audio.mp3";
    public final String u05_grief_emotion_lung = "audio/lungs/u05_grief_emotion_lung_audio.mp3";
    public final String u06_loss_emotion_lung = "audio/lungs/u06_loss_emotion_lung_audio.mp3";
    public final String u07_shame_emotion_lung = "audio/lungs/u07_shame_emotion_lung_audio.mp3";
    public final String u08_turn_it_up_lung = "audio/lungs/u08_turn_it_up_lung_audio.mp3";
    public final String u09_lung_sound_lung = "audio/lungs/u09_lung_sound_lung_audio.mp3";
    public final String u10_bring_it_back_lung = "audio/lungs/u10_bring_it_back_lung_audio.mp3";
    public final String u11_bring_in_the_positive_lung = "audio/lungs/u11_bring_in_the_positive_lung_audio.mp3";
    public final String u12_courage_emotion_lung = "audio/lungs/u12_courage_emotion_lung_audio.mp3";
    public final String u13_reason_emotion_lungs = "audio/lungs/u13_reason_emotion_lungs_audio.mp3";
    public final String u14_honor_emotion_lung = "audio/lungs/u14_honor_emotion_lung_audio.mp3";
    public final String u15_strength_lung = "audio/lungs/u15_strength_lung_audio.mp3";
    public final String u16_serenity_lung = "audio/lungs/u16_serenity_lung_audio.mp3";
    public final String u17_shut_it_down_lung = "audio/lungs/u17_shut_it_down_lung_audio.mp3";

    // Spleen and Pancreas Sounds

    public final String p01_initiation_pancreas = "audio/spleennpancreas/p01_initiation_pancreas_audio.mp3";
    public final String p02_look_deep_pancreas = "audio/spleennpancreas/p02_look_deep_pancreas_audio.mp3";
    public final String p03_look_for_worry_audio_pancreas = "audio/spleennpancreas/p03_look_for_worry_audio_pancreas_audio.mp3";
    public final String p04_anxiety_emotion_pancreas = "audio/spleennpancreas/p04_anxiety_emotion_pancreas_audio.mp3";
    public final String p05_mistrust_emotion_pancreas = "audio/spleennpancreas/p05_mistrust_emotion_pancreas_audio.mp3";
    public final String p06_doubt_emotion_pancreas = "audio/spleennpancreas/p06_doubt_emotion_pancreas_audio.mp3";
    public final String p07_nervousness_emotion_pancreas = "audio/spleennpancreas/p07_nervousness_emotion_pancreas_audio.mp3";
    public final String p08_turn_it_up_pancreas = "audio/spleennpancreas/p08_turn_it_up_pancreas_audio.mp3";
    public final String p09_pancreas_and_spleen_sound_pancreas = "audio/spleennpancreas/p09_pancreas_and_spleen_sound_pancreas_audio.mp3";
    public final String p10_bring_it_down_pancreas = "audio/spleennpancreas/p10_bring_it_down_pancreas_audio.mp3";
    public final String p11_bring_in_the_positive_pancreas = "audio/spleennpancreas/p11_bring_in_the_positive_pancreas_audio.mp3";
    public final String p12_openness_emotion_pancreas = "audio/spleennpancreas/p12_openness_emotion_pancreas_audio.mp3";
    public final String p13_faith_emotion_pancreas = "audio/spleennpancreas/p13_faith_emotion_pancreas_audio.mp3";
    public final String p14_trust_emotion_pancreas = "audio/spleennpancreas/p14_trust_emotion_pancreas_audio.mp3";
    public final String p15_neutrality_emotion_pancreas = "audio/spleennpancreas/p15_neutrality_emotion_pancreas_audio.mp3";
    public final String p16_integrity_emotion_pancreas = "audio/spleennpancreas/p16_integrity_emotion_pancreas_audio.mp3";
    public final String p17_shut_it_down_pancreas = "audio/spleennpancreas/p17_shut_it_down_pancreas_audio.mp3";

    // Triple Warmer Sounds

    public final String t01_initiation_triple_warmer = "audio/triplewarmer/t01_initiation_triple_warmer_audio.mp3";
    public final String t02_triple_warmer_sound = "audio/triplewarmer/t02_triple_warmer_sound_audio.mp3";
    public final String t03_triple_warmer_sound = "audio/triplewarmer/t03_triple_warmer_sound_audio.mp3";
    public final String t04_triple_warmer_sound = "audio/triplewarmer/t04_triple_warmer_sound_audio.mp3";

    public void loadTextureAtlas(){
        mManager.load(WorldAtlas,TextureAtlas.class);
    }

    public void loadHeartSounds(){

        // Load Heart Sounds

        mManager.load(h01_initiation_heart, Sound.class);
        mManager.load(h02_look_deep_heart, Sound.class);
        mManager.load(h03_look_for_hatred_heart, Sound.class);
        mManager.load(h04_impatience_emotion_heart, Sound.class);
        mManager.load(h05_arrogance_emotion_heart, Sound.class);
        mManager.load(h06_pride_emotion_heart, Sound.class);
        mManager.load(h07_turn_it_up_heart, Sound.class);
        mManager.load(h08_heart_sound_heart, Sound.class);
        mManager.load(h09_bring_it_down_heart, Sound.class);
        mManager.load(h10_bring_in_the_positive_heart, Sound.class);
        mManager.load(h11_joy_heart, Sound.class);
        mManager.load(h12_happiness_heart, Sound.class);
        mManager.load(h13_patience_heart, Sound.class);
        mManager.load(h14_humility_heart, Sound.class);
        mManager.load(h15_respect_heart, Sound.class);
        mManager.load(h16_gratitude_heart, Sound.class);
        mManager.load(h17_shut_it_down_heart, Sound.class);
    }

    public void loadLiverSounds(){

        // Load Liver Sounds

        mManager.load(l01_initiation_liver, Sound.class);
        mManager.load(l02_look_deep_liver, Sound.class);
        mManager.load(l03_look_for_anger_liver, Sound.class);
        mManager.load(l04_frustration_liver, Sound.class);
        mManager.load(l05_envy_liver, Sound.class);
        mManager.load(l06_jealousy_liver, Sound.class);
        mManager.load(l07_desire_emotion_liver, Sound.class);
        mManager.load(l08_guilt_liver, Sound.class);
        mManager.load(l09_turn_it_up_liver, Sound.class);
        mManager.load(l10_liver_sound_liver, Sound.class);
        mManager.load(l11_bring_it_down_liver, Sound.class);
        mManager.load(l12_bring_in_the_positive_liver, Sound.class);
        mManager.load(l13_kindness_emotion_liver, Sound.class);
        mManager.load(l14_generosity_emotion_liver, Sound.class);
        mManager.load(l15_forgiveness_emotion_liver, Sound.class);
        mManager.load(l16_appreciation_emotion_liver, Sound.class);
        mManager.load(l17_self_worth_emotion_liver, Sound.class);
        mManager.load(l18_shut_it_down_emotion_liver, Sound.class);
    }

    public void loadLungsSounds(){


        // Load Lungs Sounds

        mManager.load(u01_initiation_lung, Sound.class);
        mManager.load(u02_look_deep_lung, Sound.class);
        mManager.load(u03_depression_emotion_lung, Sound.class);
        mManager.load(u04_sorrow_emotion_lung, Sound.class);
        mManager.load(u05_grief_emotion_lung, Sound.class);
        mManager.load(u06_loss_emotion_lung, Sound.class);
        mManager.load(u07_shame_emotion_lung, Sound.class);
        mManager.load(u08_turn_it_up_lung, Sound.class);
        mManager.load(u09_lung_sound_lung, Sound.class);
        mManager.load(u10_bring_it_back_lung, Sound.class);
        mManager.load(u11_bring_in_the_positive_lung, Sound.class);
        mManager.load(u12_courage_emotion_lung, Sound.class);
        mManager.load(u13_reason_emotion_lungs, Sound.class);
        mManager.load(u14_honor_emotion_lung, Sound.class);
        mManager.load(u15_strength_lung, Sound.class);
        mManager.load(u16_serenity_lung, Sound.class);
        mManager.load(u17_shut_it_down_lung, Sound.class);
    }

    public void loadPancreasNSpleenSounds(){


        // Load Spleen and Pancreas Sounds

        mManager.load(p01_initiation_pancreas, Sound.class);
        mManager.load(p02_look_deep_pancreas, Sound.class);
        mManager.load(p03_look_for_worry_audio_pancreas, Sound.class);
        mManager.load(p04_anxiety_emotion_pancreas, Sound.class);
        mManager.load(p05_mistrust_emotion_pancreas, Sound.class);
        mManager.load(p06_doubt_emotion_pancreas, Sound.class);
        mManager.load(p07_nervousness_emotion_pancreas, Sound.class);
        mManager.load(p08_turn_it_up_pancreas, Sound.class);
        mManager.load(p09_pancreas_and_spleen_sound_pancreas, Sound.class);
        mManager.load(p10_bring_it_down_pancreas, Sound.class);
        mManager.load(p11_bring_in_the_positive_pancreas, Sound.class);
        mManager.load(p12_openness_emotion_pancreas, Sound.class);
        mManager.load(p13_faith_emotion_pancreas, Sound.class);
        mManager.load(p14_trust_emotion_pancreas, Sound.class);
        mManager.load(p15_neutrality_emotion_pancreas, Sound.class);
        mManager.load(p16_integrity_emotion_pancreas, Sound.class);
        mManager.load(p17_shut_it_down_pancreas, Sound.class);
    }

    public void loadKidneysSounds(){

        // Load Kidneys Sounds

        mManager.load(k01_initiation_kidney, Sound.class);
        mManager.load(k02_rubbing_kidney, Sound.class);
        mManager.load(k03_initiation_0_kidney, Sound.class);
        mManager.load(k04_look_deep_kidney, Sound.class);
        mManager.load(k05_look_for_fear_kidney, Sound.class);
        mManager.load(k06_trauma_emotion_kidney, Sound.class);
        mManager.load(k07_phobia_emotion_kidney, Sound.class);
        mManager.load(k08_apathy_emotion_kidney, Sound.class);
        mManager.load(k09_despair_emotion_kidney, Sound.class);
        mManager.load(k10_cowardice_emotion_kidney, Sound.class);
        mManager.load(k11_turn_it_up_kidney, Sound.class);
        mManager.load(k12_kidney_sound_kidney, Sound.class);
        mManager.load(k13_bring_it_back_kidney, Sound.class);
        mManager.load(k14_bring_in_the_positive_kidney, Sound.class);
        mManager.load(k15_acceptance_emotion_kidney, Sound.class);
        mManager.load(k16_willingness_emotion_kidney, Sound.class);
        mManager.load(k17_peace_emotion_kidney, Sound.class);
        mManager.load(k18_stillness_emotion_kidney, Sound.class);
        mManager.load(k19_love_emotion_emotion_kidney, Sound.class);
        mManager.load(k20_hope_emotion_kidney, Sound.class);
        mManager.load(k21_shut_it_down_kidney, Sound.class);
    }

    public void loadTripleWarmersSounds(){
        // Load Triple Warmer Sounds

        mManager.load(t01_initiation_triple_warmer, Sound.class);
        mManager.load(t02_triple_warmer_sound, Sound.class);
        mManager.load(t03_triple_warmer_sound, Sound.class);
        mManager.load(t04_triple_warmer_sound, Sound.class);
    }

    public boolean update() {
        return mManager.update();
    }

    public void finishLoading() {
        mManager.finishLoading();
    }

    public float getProgress() {
        return mManager.getProgress();
    }


    @Override
    public void dispose() {
    mManager.dispose();

    }
}


