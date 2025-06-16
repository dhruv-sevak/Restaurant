// Employee Class
public class Employee extends Person {
    public static int employeeCnt = 1;

    private String position;
    private int yearOfHire;
    private double wage;
    private int weeks;
    private int count;

    // Non-default Constructor For Employee
    public Employee(String name, String phoneNumber, String position, int yearOfHire, double wage, int weeks) {
        super(name, phoneNumber);
        this.position = position;
        this.yearOfHire = yearOfHire;
        this.wage = wage;
        this.weeks = weeks;
        this.count = employeeCnt;
        employeeCnt++;
    }

    // Constructor For Employee
    public Employee() {
        super();
        this.position = "";
        this.yearOfHire = 0;
        this.wage = 0.0;
        this.weeks = 0;
    }

    // getters and setters
    public void setEmployeeCnt(int employeeCnt) {
        this.count = employeeCnt;
    }

    public int getEmployeeCnt() {
        return employeeCnt;
    }

    // getters and setters...
    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    // getters and setters...
    public void setYears(int yearOfHire) {
        this.yearOfHire = yearOfHire;
    }

    public int getYears() {
        return yearOfHire;
    }

    // getters and setters...
    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    // getters and setters...
    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    public int getWeeks() {
        return weeks;
    }

    public void printEmployeeTable() {
        // Employee Table
        System.out.println("Employee Information");
        System.out.println(
                "Employee # | Name        | Phone         | Year of Hiring | Position | Wage Rate/hr | Weekly Hours |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
        System.out.println(count + "          | " + name + " | " + phoneNumber + "    | "
                + yearOfHire + "           | " + position + "  | " + wage + "         | " + weeks
                + "           |");
        System.out.println(
                "--------------------------------------------------------------------------------------------------------");
    }
}