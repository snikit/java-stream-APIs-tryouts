package me.snikit.javatryouts.designs;

import java.util.function.Consumer;

// Loan design pattern or execute around pattern
public class ExecuteAround {

	private static ExecuteAround managedInstance;

	public static void use(Consumer<ExecuteAround> block) {
		managedInstance = new ExecuteAround();

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
