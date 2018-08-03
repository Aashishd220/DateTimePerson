package com.cg.persontest;

import com.cg.person.Person;

//class with main function invoking functions of Person class

public class PersonTest {

	public static void main(String args[]) {
		Person person1 = new Person("Aashish", 5, 6, 1990); // passing values to constructor
		Person person2 = new Person("Rohit", 5, 6, 1996);

		person1.display(); // display function invoked
		person2.display();

		person1.OlderOne(person1, person2); // person function invoked

	}
}
