package com.macuguita.moodsound;

import eu.midnightdust.lib.config.MidnightConfig;

public final class MoodSound {
    public static final String MOD_ID = "moodsound";

    public static void init() {
        MidnightConfig.init(MOD_ID, SoundConfig.class);
        // Write common init code here.
    }
}
