package me.snikit.javatryouts.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import me.snikit.javatryouts.streams.model.Person;

public class ObjectStreamAPIs {

	public void sortBySalary(List<Person> data) {

		List<Person> sortedList = data.stream().sorted(Comparator.comparingLong(Person::getSalary))
				.collect(Collectors.toList());
		System.out.println("\nSorted List by salary : " + sortedList);
	}

	public void getTopSalariedEmployees(List<Person> testList, int i) {
		List<Person> sortedList = testList.stream().sorted(Comparator.comparingLong(Person::getSalary).reversed())
				.limit(i).collect(Collectors.toList());
		System.out.println("\nTop " + i + " salaried employees : " + sortedList);

	}

	public void getNameList(List<Person> testList) {
		List<String> sortedList = testList.stream().map(Person::getName).collect(Collectors.toList());
		System.out.println("\n Names list: " + sortedList);

	}

	public void createMapWithNamesAsKey(List<Person> testList) {
		Map<String, Person> map = testList.stream().collect(Collectors.toMap(Person::getName, i -> i));
		System.out.println("\n Names list: " + map);
	}

	public void printIsNamePresent(String nameToFind, List<Person> testList) {

		boolean namePresent = testList.stream().anyMatch(i -> i.getName().equals(nameToFind));
		System.out.println("\n Name " + nameToFind + " present: " + namePresent);

	}

	public void printIfNamePresent(String nameToFind, List<Person> testList) {

		Optional<Person> optionalPerson = testList.stream().filter(i -> i.getName().equals(nameToFind)).findFirst();

		if (optionalPerson.isPresent()) {
			System.out.println("\n Name " + nameToFind + " present ");
		} else {
			System.out.println("\n Name " + nameToFind + " not found ");
		}
	}

	public void namesToList(List<Person> testList) {

		System.out.println("names list = " + testList.stream().map(Person::getName).collect(Collectors.toList()));

	}

	public void sumOfSalaries(List<Person> testList) {
		System.out.println(
				"Salary sum = " + testList.stream().collect(Collectors.summingLong(Person::getSalary)));

	}

	public void salarayStats(List<Person> testList) {
		System.out.println(
				"Salary stats = " + testList.stream().collect(Collectors.summarizingLong(Person::getSalary)));


		
	}

	public void groupBySalary(List<Person> testList, int amount) {
		System.out.println(
				"Salary groups = " + testList.stream().collect(Collectors.partitioningBy( e -> e.getSalary() > amount)));
		


		
	}

}
