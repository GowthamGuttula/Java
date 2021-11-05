package org.gow79.misc;

import java.util.Optional;

public class OptionalTest {

	public static void main(String a[]) {
		//Optional<String> optionalStringList = null;
		
		var x = Optional.ofNullable(null).orElseGet(()->"Test");
		System.out.println(x);
		//optionalStringList.get();
	}
	
}
