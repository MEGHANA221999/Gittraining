package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ex2Test {

	@Test
	void testSum() {
		Ex2 s = new Ex2();
		assertEquals(4,(s.sum(2, 2)));
	}
	@Test
	void testSum2() {
		Ex2 s1 = new Ex2();
		assertEquals(10,(s1.sum(5, 5)));
	}

}
