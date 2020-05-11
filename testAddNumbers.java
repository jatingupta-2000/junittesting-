package jUnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		junitFunction obj = new junitFunction();
		int res= obj.addnum(100,200);
		assertEquals(300,res);
		
	}

}
