package com.devpadawan.katas.codewars.easy;

import static java.util.Arrays.stream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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
 * Write a function that can return the smallest value of an array or the index
 * of that value. The function's 2nd parameter will tell whether it should
 * return the value or the index.
 * 
 * Assume the first parameter will always be an array filled with at least 1
 * number and no duplicates. Assume the second parameter will be a string
 * holding one of two values: 'value' and 'index'.
 * </p>
 *
 * @author Josimar Silva - josimaralves.ti@gmail.com
 * @since Jun 30, 2015
 * 
 */
public final class Arrays {

	/**
	 * @param numbers
	 * @param toReturn
	 * @return
	 */
	public static int findSmallest(final int[] numbers, final String toReturn) {
		
		final int smallestValue = stream(numbers).min().getAsInt();

		return toReturn.equals("value") ? smallestValue : toArray(numbers).indexOf(smallestValue);
	}

	/** 
	 * 
	 * @param numbers to search
	 * @return the smallest value in the array
	 * 
	 * @deprecated
	 */
	@Deprecated
	@SuppressWarnings(value = {"unsed"})
	private static int findSmallestValueIn(final List<Integer> numbers) {
	    return numbers.stream() 
	    		.min(Comparator.comparing(number -> number.intValue()))
	    		.get();	 

	}

	/**
	 * 
	 * @param numbers to convert to {@link ArrayList}
	 * @return {@link ArrayList} with the values
	 */
	private static List<Integer> toArray(final int[] numbers) {
		final List<Integer> result = new ArrayList<Integer>();

		for (int i : numbers) {
			result.add(i);
		}

		return result;
	}
}
