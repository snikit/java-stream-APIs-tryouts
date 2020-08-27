package me.snikit.javatryouts.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamAPIs {

	public void printArray(String msg, int[] array) {
		System.out.println(msg + Arrays.toString(array));
	}

	public void sort(int[] array) {

		int[] duplicateArray = IntStream.of(array).sorted().toArray();
		this.printArray("\nSorted Array ", duplicateArray);

	}

	public void findStats(int[] array) {

		IntSummaryStatistics stats = IntStream.of(array).summaryStatistics();
		System.out.println("\nStats are as follows :");
		System.out.println("Max : " + stats.getMax());
		System.out.println("Min : " + stats.getMin());
		System.out.println("Average : " + stats.getAverage());
		System.out.println("Count : " + stats.getCount());
		System.out.println("Sum : " + stats.getSum());

	}

	public void findTop(int[] array, int count) {
		int[] topArray = IntStream.of(array).boxed().sorted(Collections.reverseOrder()).limit(3)
				.mapToInt(i -> i.intValue()).toArray();
		this.printArray("\nTop" + count + " elements ", topArray);
	}

	public void findEven(int array[]) {
		int[] evenArray = IntStream.of(array).filter(i -> i % 2 == 0).toArray();
		this.printArray("\nEven elements ", evenArray);
	}

	public void hasOddValue(int array[]) {
		boolean hasOddValue = IntStream.of(array).anyMatch(i -> i % 2 != 0);
		System.out.println("\nHas odd vaule = " + hasOddValue);
	}

	public void printRangeArray(int i, int j) {
		this.printArray("\nRange = ", IntStream.rangeClosed(i, j).toArray());

	}

	public void reduceToProductOfElements(int[] testArray) {
		OptionalInt product = IntStream.of(testArray).reduce((i, j) -> i * j);
		System.out.println("\nHas odd vaule = " + product.getAsInt());
	}

	public void iterateAndPrint(int[] testArray) {
		System.out.println("\n Iterating wit Stream APi" );
		Stream.iterate( 0 , i -> i+1).limit(testArray.length).forEach( i -> System.out.println(testArray[i]));
		
	}

}
