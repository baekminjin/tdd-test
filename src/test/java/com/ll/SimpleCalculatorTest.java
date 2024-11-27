package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
	@Test
	@DisplayName("1+2=3")
	public void t1() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		int rs = simpleCalculator.plus(1, 2);

		assertEquals(3, rs); //예상값과 나와야하는 값
	}

	@Test
	@DisplayName("2+10=13")
	public void t2() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		int rs = simpleCalculator.plus(2, 10);

		assertEquals(12, rs); //예상값과 나와야하는 값
	}

}
