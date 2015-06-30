package com.devpadawan.katas.codewars.easy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

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
 * Test for {@link Arrays}
 * </p>
 *
 * @author Josimar Silva - josimaralves.ti@gmail.com
 * @since Jun 30, 2015
 * 
 */
public class ArraysTest {

	@Test
	public void muchReturnTheIndexOfTheSmallestValue() {
		
		//given 
		int[] numbers = new int[] { 1, 2, 3 };
		
		//when 
		int indexOfTheSmallestValue = Arrays.findSmallest(numbers, "index");
		
		//then
		assertThat("The smallest index", indexOfTheSmallestValue, equalTo(0));
	}

	@Test
	public void muchReturnTheSmallestValue() {
		//given 
		int[] numbers = new int[] { 7, 12, 3, 2, 27 };
				
		//when 
		int indexOfTheSmallestValue = Arrays.findSmallest(numbers, "value");
				
		//then
		assertThat("The smallest value", indexOfTheSmallestValue, equalTo(2));
	}
}
