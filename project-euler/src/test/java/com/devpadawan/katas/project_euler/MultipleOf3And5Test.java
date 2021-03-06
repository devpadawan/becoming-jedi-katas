package com.devpadawan.katas.project_euler;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

/*
 * Copyright (c) 2015 Josimar Silva
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
