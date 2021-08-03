package com.Person;

public class Student extends Person{
    //
    private double cgpa;
    //
    public Student(double cgpa) {
        this.cgpa = cgpa;
    }
    //
    public Student(String name, int age, double cgpa) {
        super(name, age);
        this.cgpa = cgpa;
    }
    //
    public double getCgpa() {
        return cgpa;
    }
    //
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
