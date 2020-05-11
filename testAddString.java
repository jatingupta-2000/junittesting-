package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddString {

	@Test
	void test() {
		junitFunction obj1 = new junitFunction();
		String res= obj1.addstr("JATIN", "GUPTA");
		assertEquals("JATINGUPTA",res);
	}

}
