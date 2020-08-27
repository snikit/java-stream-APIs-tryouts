package me.snikit.javatryouts;

import java.util.List;

import me.snikit.javatryouts.streams.IntStreamAPIs;
import me.snikit.javatryouts.streams.ObjectStreamAPIs;
import me.snikit.javatryouts.streams.model.Person;
import me.snikit.javatryouts.streams.model.PersonService;

public class Main {

	public static void main(String[] args) {

		testIntStreamAPIs();
		testObjectStreamAPIs();
	}

	private static void testObjectStreamAPIs() {
		PersonService personService = new PersonService();
		List<Person> testList = personService .getPersonData();
		ObjectStreamAPIs streamAPIs = new ObjectStreamAPIs();
		
		System.out.println("Test list = " + testList.toString());
		streamAPIs.sortBySalary(testList);
		streamAPIs.getTopSalariedEmployees(testList , 3);
		streamAPIs.getNameList(testList);
		streamAPIs.createMapWithNamesAsKey(testList);
		streamAPIs.printIsNamePresent("Niko" ,testList);
		streamAPIs.printIfNamePresent("Niko" ,testList);
		streamAPIs.namesToList(testList);
		streamAPIs.sumOfSalaries(testList);
		streamAPIs.salarayStats(testList);
		streamAPIs.groupBySalary(testList , 35);
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
		streamAPIs.iterateAndPrint(testArray);
		
	}
	

}
