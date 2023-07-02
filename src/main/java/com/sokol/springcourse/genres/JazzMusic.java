package com.sokol.springcourse.genres;

import com.sokol.springcourse.Music;

public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Jazz Song";
    }
}
