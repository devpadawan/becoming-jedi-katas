package com.devpadawan.katas.project_euler;

import java.util.HashSet;
import java.util.Set;

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
 * <p> If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000. </p> 
 * <p> <b> https://projecteuler.net/problem=1 </b> </p>
 *
 * @author Josimar Silva - josimaralves.ti@gmail.com
 * @since Jun 28, 2015
 * 
 */
public final class MultipleOf3And5 {
	
	
	MultipleOf3And5() {
	}
	
	/**
	 * 
	 * <p>Static factory method.</p>
	 * 
	 * @return an instance of {@link MultipleOf3And5}.
	 */
	public static MultipleOf3And5 newInstance() {
		return new MultipleOf3And5();
	}

	/**
	 * 
	 * <p> Calculate a sum of the multiples of 3 and 5 below 
	 * the maximum number stipulated. </p>
	 * 
	 * @param maximum number to be calculate
	 * @return sum of the multiples 
	 */
	public long calculateSumOfMultiplesOf3And5Below(final long max) {
		final Set<Integer> multiples = new HashSet<Integer>();	
		
		captureMultiplesUpTo(max, multiples);
		
		final long sumOfMultiples = multiples.stream()
			.mapToInt(Integer::intValue)
			.sum();
		
		return sumOfMultiples;
	}

	/**
	 * 
	 * <p> Capture the multiples up to the maximum number stipulated. </p>
	 * 
	 * @param max
	 * @param multiples
	 */
	private void captureMultiplesUpTo(final long max,
			final Set<Integer> multiples) {
		for(int i = 0; i < max; i++){
			if(isMultipleOf3Or5(i)){
				multiples.add(i);
			}
		}
	}
	
	/**
	 * 
	 * <p> Check if the current number is multiple of 3 or 5. </p>
	 * 
	 * @param number to be checked
	 * @return true, if the number is multiple of one of them
	 */
	private boolean isMultipleOf3Or5(final int number){
		return ((number % 3) == 0 || (number % 5 ) == 0);
	}	
		
}
