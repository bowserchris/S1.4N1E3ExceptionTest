package n1e1to3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppE3ExceptionTest {

	@Test
	void throwsArraysOutOfBoundIndexException() {
		var test = new AppE3Exception();
		ArrayIndexOutOfBoundsException aioobe = assertThrows(ArrayIndexOutOfBoundsException.class, ()-> test.printThruList(), "Expected to print, but out of bounds");
		String expectedMessage = "Expected to print, but out of bounds";
		String actualMessage = aioobe.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}

}
