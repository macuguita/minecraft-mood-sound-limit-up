package com.macuguita.moodsound.mixin;

import com.macuguita.moodsound.SoundConfig;
import net.minecraft.client.sound.SoundEngine;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(SoundEngine.class)
public class SoundEngineMixin {

    @ModifyArg(
            method = "init",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/sound/SoundEngine$SourceSetImpl;<init>(I)V"
            ),
            index = 0 // Modify the first argument (maxSourceCount)
    )
    private int increaseSourceCount(int originalMaxSourceCount) {
        // Check if the original value is the default limit for mood sounds
        if (originalMaxSourceCount == 8) {
            // Return the custom value from SoundConfig
            return SoundConfig.maxMoodSounds;
        }
        // Otherwise, return the original value
        return originalMaxSourceCount;
    }
}