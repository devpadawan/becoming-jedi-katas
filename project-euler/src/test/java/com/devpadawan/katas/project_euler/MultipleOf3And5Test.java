package com.devpadawan.katas.project_euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

/**
 *
 * <p>
 * Test for {@link MultipleOf3And5}.
 * </p>
 *
 * @author Josimar Silva - josimaralves.ti@gmail.com
 * @since Jun 29, 2015
 * 
 */
public class MultipleOf3And5Test {

	@Test
	public void mostSumMultiplesOf3And5Below10() {

		// give
		final int ten = 10;

		// when
		final long result = MultipleOf3And5.newInstance()
				.calculateSumOfMultiplesOf3And5Below(ten);

		// then
		assertThat(result, equalTo(23L));
	}
	
	@Test
	public void mostSumMultiplesOf3And5Below1000() {

		// give
		final int oneThousand = 1000;

		// when
		final long result = MultipleOf3And5.newInstance()
				.calculateSumOfMultiplesOf3And5Below(oneThousand);

		// then
		assertThat(result, equalTo(233168L));
	}

}
