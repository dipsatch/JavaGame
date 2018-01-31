package com.redomar.game.script;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class PrintingTest {

	private Printing printing;

	@Before
	public void setUp() throws Exception {
		printing = new Printing();
	}

	@Test
	public void printToFileWorks() throws Exception {
		printing.print("TESTING STRING", PrintTypes.TEST);
		File file = new File(".PrintType-TEST.txt");
		assertTrue(file.exists());
		assertTrue(file.delete());
	}

	@After
	public void cleanUp(){
		printing = null;
	}

}