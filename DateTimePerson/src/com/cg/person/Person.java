package com.cg.person;

//Class person gives the detail of age of two persons and compare them which one is older

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Person {

	private String name;
	private Date dob;
	private int days, months, years;
	private Period period;
	private LocalDate today, dateof, dateOfBirth1, dateOfBirth2;

	/**
	 * @param name
	 * @param days
	 * @param months
	 * @param years
	 */
	public Person(String name, int days, int months, int years) {
		this.name = name;
		this.days = days;
		this.months = months;
		this.years = years;

	}

	public int getDays() {
		return days;
	}

	public int getMonths() {
		return months;
	}

	public int getYears() {
		return years;
	}

//function used to print details of two persons
	public void display() {

		System.out.println("Name:" + name);
		System.out.println("Date of birth:" + days + "/" + months + "/" + years);

		today = LocalDate.now();
		dateof = LocalDate.of(years, Month.of(months), days);
		period = Period.between(dateof, today);

		System.out.println("Age:" + period.getYears() + " Years: " + period.getYears() + " Months:" + period.getMonths()
				+ " Days:" + period.getDays());
	}

//function comparing age of two persons
	public void OlderOne(Person p, Person p2) {
		String person1Name = p.name;
		String person2Name = p2.name;

		int p1year = p.years;
		int p1month = p.months;
		int p1day = p.days;
		int p2year = p2.years;
		int p2month = p2.months;
		int p2day = p2.days;

		dateOfBirth1 = LocalDate.of(p1year, Month.of(p1month), p1day);// storing date of birth

		dateOfBirth2 = LocalDate.of(p2year, Month.of(p2month), p2day);

		period = Period.between(dateOfBirth1, dateOfBirth2);

		int older = (dateOfBirth1.compareTo(dateOfBirth2));// comparing which one is older
		if (older > 0) {
			System.out.println(person2Name + " is older than " + person1Name + " by" + period.getYears() + " Years, "
					+ period.getMonths() + " Months, " + period.getDays() + " days");
		} else if (older < 0) {
			System.out.println(person1Name + " is older than " + person2Name + " by " + period.getYears() + " Years, "
					+ period.getMonths() + " Months, " + period.getDays() + " days");
		} else if (older == 0) {
			System.out.println("Both are of same age");
		}

	}

}
