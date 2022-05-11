package ro.fasttrackit.code.ex4;


import ro.fasttrackit.code.ex3.Person;

public class Employee extends Person {
    private final String company;
    private final int salary;

    public Employee(String name, int age, String hairColor, String company, int salary) {
        super(name, age, hairColor);
        this.company =company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
