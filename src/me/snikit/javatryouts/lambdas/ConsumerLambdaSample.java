package me.snikit.javatryouts.lambdas;

import java.util.function.Consumer;

// Loan design pattern or execute around pattern
public class ConsumerLambdaSample {

	private static ConsumerLambdaSample managedInstance;

	public static void use(Consumer<ConsumerLambdaSample> block) {
		managedInstance = new ConsumerLambdaSample();

		try {
			block.accept(managedInstance);
		} finally {
			managedInstance.garbageCollect();
		}

	}

	private void garbageCollect() {
		System.out.println("garbage collected !");
	}

	public void performIOOperation() {
		System.out.println("performIOOperation");

	}

}
