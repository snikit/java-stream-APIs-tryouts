package me.snikit.javatryouts.streams.data;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

	public List<Person> getPersonData() {

		List<Person> persons = new ArrayList<Person>();

		persons.add(this.getPerson("Tom", 65));
		persons.add(this.getPerson("Lynx", 16));
		persons.add(this.getPerson("Jon", 98));
		persons.add(this.getPerson("Doe", 33));
		persons.add(this.getPerson("Max", 27));

		return persons;
	}

	private Person getPerson(String name, long salary) {
		return new Person(name, salary);
	}

}
