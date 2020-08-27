package me.snikit.javatryouts;

import me.snikit.javatryouts.streams.IntStreamAPIs;

public class Main {

	public static void main(String[] args) {

		testIntStreamAPIs();
		testObjectStreamAPIs();
	}

	private static void testObjectStreamAPIs() {
		// TODO Auto-generated method stub
		
	}

	private static void testIntStreamAPIs() {
		int[] testArray = { 5, 12, 8, 2, 9, 3, 6, 4, 2, 1, 6, 8 };

		IntStreamAPIs streamAPIs = new IntStreamAPIs();
		
		streamAPIs.printArray("Original Array ", testArray);
		streamAPIs.sort(testArray);
		streamAPIs.findStats(testArray);
		streamAPIs.findTop(testArray , 3);
		streamAPIs.findEven(testArray);
		streamAPIs.hasOddValue(testArray);
		streamAPIs.printRangeArray(1,20);
		streamAPIs.reduceToProductOfElements(testArray);
	}

}
