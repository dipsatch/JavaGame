package com.redomar.game.script;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class SplashTest {

    @Test
    public void splashFileExists() throws Exception {
        File splashImage = new File("res/splash/splash.png");
        assertTrue(splashImage.exists());
    }
}
