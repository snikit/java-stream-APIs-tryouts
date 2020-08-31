package me.snikit.javatryouts.designs;

import java.util.function.Supplier;

public class LazyGet {

	static class Lazy<T> {

		private T instance;
		private Supplier<T> suplier;

		Lazy(Supplier<T> suplier) {
			this.suplier = suplier;
		}

		public T get() {
			if (instance == null) {
				instance = this.suplier.get();
				this.suplier = null;
			}
			return instance;
		}

	}

	public static int compute(int x) {
		System.out.println("heavy computation");
		return x * 10;
	}

	public static void testLazyGet() {
		int x = 4;
		var computeLazy = new Lazy<Integer>(() -> compute(x));

		if (x > 3 && computeLazy.get() < 10) {
			System.out.println("testing lazzy call");
		}

		System.out.println("calling again");
		System.out.println(computeLazy.get());
		System.out.println("calling again n again");
		System.out.println(computeLazy.get());

	}

}
