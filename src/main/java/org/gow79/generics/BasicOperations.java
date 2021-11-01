package org.gow79.generics;

import org.gow79.generics.interfaces.UnaryPredicate;

public class BasicOperations implements UnaryPredicate<Integer>{

	@Override
	public boolean test(Integer value) {
		return value %2 ==0;
	}
	
	static class  xyz{
		
		public static boolean palindrome(int value) {
			
			//palindrome logic
			
			return true;
		}
	}

}
