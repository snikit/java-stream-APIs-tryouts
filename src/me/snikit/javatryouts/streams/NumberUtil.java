package me.snikit.javatryouts.streams;

import java.util.function.Function;

public class NumberUtil {

	public static boolean isOdd(long number) {
		return number % 2 != 0;
	}

	public static boolean isEven(long number) {
		return number % 2 == 0;
	}

	public static Function<Long,Long> returnEvenOrZero = (number) -> {
		if (number % 2 == 0) {
			return number;
		} else {
			return 0l;
		}
	};

}
