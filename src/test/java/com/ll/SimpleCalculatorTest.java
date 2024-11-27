package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SimpleCalculatorTest {
	@Test
	@DisplayName("1+2=3")
	public void t1() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		int rs = simpleCalculator.plus(1, 2);

		//assertEquals(3, rs); //예상값과 나와야하는 값
		assertThat(rs).isEqualTo(3);
		//나는 rs가 3임을 단정적으로 한다.
	}

	@Test
	@DisplayName("2+10=13")
	public void t2() {
		SimpleCalculator simpleCalculator = new SimpleCalculator();
		int rs = simpleCalculator.plus(2, 10);

		assertThat(rs).isEqualTo(12);
	}

}
