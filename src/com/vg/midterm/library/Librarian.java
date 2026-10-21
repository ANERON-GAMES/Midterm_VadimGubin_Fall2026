package com.vg.midterm.library;

/*
 * Author: Vadim Gubin
 * Student ID: 301538942
 * Date: October 21, 2026
 * Description: Librarian. Pay, late fees, report, and book reserve.
 */

public class Librarian extends LibraryStaff implements Reportable, Reservable {

	private final int dailyIssueLimit;
	private final int booksProcessed;

	public Librarian(String personId, String name, String phoneNumber, String staffId, String department, double monthlySalary, int dailyIssueLimit, int booksProcessed) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.dailyIssueLimit = dailyIssueLimit;
		this.booksProcessed = booksProcessed;
	}

	public int getDailyIssueLimit() {
		return dailyIssueLimit;
	}

	public int getBooksProcessed() {
		return booksProcessed;
	}

	public double calculateLateFee(int daysOverdue) {
		return calculateLateFee(daysOverdue, 1.0);
	}

	public double calculateLateFee(int daysOverdue, double dailyRate) {
		if (daysOverdue < 0) {
			System.out.println("Late fee failed. Days can not be negative.");
			return -1;
		}
		if (dailyRate <= 0) {
			System.out.println("Late fee failed. Rate is not valid.");
			return -1;
		}
		return daysOverdue * dailyRate;
	}

	public double calculateMonthlyCompensation() {
		return getMonthlySalary() + (booksProcessed * 2.0);
	}

	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Daily issue limit: " + dailyIssueLimit);
		System.out.println("Books processed: " + booksProcessed);
	}

	public String getRoleDescription() {
		return "Librarian";
	}

	public String generateReport() {
		return "Librarian report. Books processed: " + booksProcessed;
	}

	public String reserveBook(String bookId) {
		if (bookId == null || bookId.trim().equals("")) {
			return "Reservation failed. Book id is empty.";
		}
		return "Book " + bookId + " is reserved.";
	}
}
