package com.sokol.springcourse.genres;

import com.sokol.springcourse.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock Song";
    }
}
