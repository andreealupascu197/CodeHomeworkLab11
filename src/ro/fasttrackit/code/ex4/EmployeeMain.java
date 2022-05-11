package ro.fasttrackit.code.ex4;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Popescu Maria", 21, "brown", "Google", 2000));
        employeeList.add(new Employee("Pop Adrian", 35, "red", "Facebook", 2000));
        employeeList.add(new Employee("Rotundu Ana", 44, "black", "Google", 12000));
        System.out.println(employeeList);
        System.out.println(getSalariesHigherThan(employeeList, 5000));
        System.out.println(getPersonsForCompany(employeeList));
        System.out.println(getTotal(employeeList));
        System.out.println(getCompanyWithHighestSalary(employeeList));

        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(o1.getSalary() == o2.getSalary()) {
                    return o2.getName().compareTo(o1.getName());
                } else {
                    return o2.getSalary() -o1.getSalary();
                }
            }
        });
        System.out.println(employeeList);
    }

    public static List<Employee> getSalariesHigherThan(List<Employee> personList, int salary) {
        List<Employee> salariesHigher = new ArrayList<>();
        for (Employee employee : personList) {
            if (salary < employee.getSalary()) {
                salariesHigher.add(employee);
            }
        }
        return salariesHigher;
    }

    public static Map<String, List<Employee>> getPersonsForCompany(List<Employee> employeeList) {
        Map<String, List<Employee>> personsForCompany = new HashMap<>();
        for (Employee employee : employeeList) {
            if (personsForCompany.containsKey(employee.getCompany())) {
                personsForCompany.get(employee.getCompany()).add(employee);
            } else {
                List<Employee> employees = new ArrayList<>();
                employees.add(employee);
                personsForCompany.put(employee.getCompany(), employees);
            }
        }
        return personsForCompany;
    }

    public static int getTotal(List<Employee> employeeList) {
        int totalSumOfSalary = 0;
        for (Employee employee : employeeList) {
            totalSumOfSalary += employee.getSalary();
        }
        return totalSumOfSalary;
    }

    public static String getCompanyWithHighestSalary(List<Employee> employeeList) {
        String companyWithHighestSalary = "";
        int maxSalary =0;
        for (Employee employee : employeeList) {
            if(employee.getSalary() > maxSalary) {
                companyWithHighestSalary = employee.getCompany();
                maxSalary = employee.getSalary();
            }
        }
        return companyWithHighestSalary;
    }
}
