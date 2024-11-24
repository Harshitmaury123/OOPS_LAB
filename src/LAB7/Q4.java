//Q4.) Create a class called date that include three instance variable a) month(type int) b)day (type int) and
//c) year (type int) . provide a constructer that initialize a three instance variable and assume the value
//provided are correct. Provide a set and a get method for each instance variable.Provide a method
//DisplayDate that display the month year and day separated by forward slashand write a test application
//named DateTest that demonstrate date capabilities.


package LAB7;

import java.util.Scanner;

class Date {
    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor to initialize the instance variables
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setter and Getter for month
    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    // Setter and Getter for day
    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }

    // Setter and Getter for year
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    // Method to display the date in the format: month/day/year
    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }
}


public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a Date object using the constructor
        System.out.println("Enter Month: ");
        int month = sc.nextInt();
        System.out.println("Enter day: ");
        int day = sc.nextInt();
        System.out.println("Enter Year: ");
        int year = sc.nextInt();
        Date date = new Date(month, day, year);

        // Display the initial date
        System.out.println("Initial Date:");
        date.displayDate();

        // Update the date using setters
        date.setMonth(month);
        date.setDay(day);
        date.setYear(year);

        // Display the updated date
        System.out.println("Updated Date:");
        date.displayDate();

        // Get individual values using getters
        System.out.println("Month: " + date.getMonth());
        System.out.println("Day: " + date.getDay());
        System.out.println("Year: " + date.getYear());
    }
}

