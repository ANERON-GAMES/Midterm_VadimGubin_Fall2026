Library Management System
Vadim Gubin 301538942
Project name: Midterm_VadimGubin_Fall2026

How to run
Open this folder as an Eclipse project and run Main.
Package is com.vg.midterm.library.

From a terminal, in the project folder:
javac --release 25 -d bin src/com/vg/midterm/library/*.java
java -cp bin com.vg.midterm.library.Main

Class hierarchy
Person is the parent class. It is abstract.
Member extends Person. That is single inheritance.
LibraryStaff also extends Person, and it is abstract.
Librarian and LibraryAssistant both extend LibraryStaff. That is hierarchical inheritance.
SeniorLibrarian extends Librarian. The full line is Person, LibraryStaff, Librarian, SeniorLibrarian. That is multilevel inheritance.
A Java class can not extend two classes at the same time. Librarian implements Reportable and Reservable instead. Class inheritance plus interfaces is hybrid inheritance.

What the numbers do
Late fee is 1 dollar for each overdue day, unless a daily rate is passed in.
Librarian pay is the monthly salary plus 2 dollars for each book processed.
Senior librarian pay is that same pay plus the seniority allowance.
Library assistant pay is the monthly salary plus the shift allowance.
personCount goes up in the Person constructor, one time.
memberCount goes up only in the Member constructor.
staffCount goes up only in the LibraryStaff constructor.
A failed registration returns null and does not call the constructor, so the counters stay the same.

Test cases in Main
1. Two members register.
2. A member with age 8 is rejected.
3. Late fee for 4 days at the default rate.
4. Late fee for 3 days at 1.50.
5. Negative days and a zero rate are rejected.
6. Pay for librarian, senior librarian, and assistant through a LibraryStaff reference.
7. Report and a book reservation, plus an empty book id.
8. The three counters at the end.
