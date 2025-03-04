package com.macuguita.moodsound;

import eu.midnightdust.lib.config.MidnightConfig;

public class SoundConfig extends MidnightConfig {
    public static final String TEXT = "text";
    public static final String NUMBERS = "numbers";
    public static final String SLIDERS = "sliders";
    public static final String LISTS = "lists";
    public static final String FILES = "files";

    @Entry(category = NUMBERS) public static int maxMoodSounds = 128;
}
