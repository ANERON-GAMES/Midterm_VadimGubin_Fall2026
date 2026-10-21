package com.vg.midterm.library;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: October 21, 2026
 * Description: Senior librarian. Adds a seniority allowance on top of librarian pay.
 */

public class SeniorLibrarian extends Librarian {

	private final String specialization;
	private final double seniorityAllowance;

	public SeniorLibrarian(String personId, String name, String phoneNumber, String staffId, String department, double monthlySalary, int dailyIssueLimit, int booksProcessed, String specialization, double seniorityAllowance) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary, dailyIssueLimit, booksProcessed);
		this.specialization = specialization;
		this.seniorityAllowance = seniorityAllowance;
	}

	public String getSpecialization() {
		return specialization;
	}

	public double getSeniorityAllowance() {
		return seniorityAllowance;
	}

	// overrided pay: librarian pay plus the seniority allowance
	public double calculateMonthlyCompensation() {
		return super.calculateMonthlyCompensation() + seniorityAllowance;
	}

	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Specialization: " + specialization);
		System.out.println("Seniority allowance: " + seniorityAllowance);
	}

	public String getRoleDescription() {
		return "Senior librarian";
	}
}
