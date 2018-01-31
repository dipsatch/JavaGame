package com.redomar.game.audio;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class AudioEffectTest {

	@Test
	public void sfxFileExists() throws Exception {
		File sfx = new File("res/sfx/smallProjectile.wav");
		assertTrue(sfx.exists());
	}

}