package com.macuguita.moodsound.forge;

import net.minecraftforge.fml.common.Mod;

import com.macuguita.moodsound.MoodSound;

@Mod(MoodSound.MOD_ID)
public final class MoodSoundForge {
    public MoodSoundForge() {
        // Run our common setup.
        MoodSound.init();
    }
}
