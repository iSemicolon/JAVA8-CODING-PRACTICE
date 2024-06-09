package realtime_coding_set.main;

import realtime_coding_set.model.Employee;
import realtime_coding_set.service.EmployeeService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeService();

        List<Employee> employeeList=employeeService.getEmployees();

        //1. Find out the count of male and female employees present in the organization?

        System.out.println("-- Counting Male, Female--");
        Map<String,Long> maleFemaleCounting=employeeList.stream().collect(Collectors.groupingBy(n->n.getGender(),Collectors.counting()));
        maleFemaleCounting.forEach((key, value)-> System.out.println(key+" : "+value));


        //2. Write a program to print the names of all departments in the organization?

        System.out.println("-- Name of All Departments--");
        List<String> nameLists=employeeList.stream().map(n->n.getDepartment()).distinct().collect(Collectors.toList());
        nameLists.forEach(System.out::println);

        //3. Find the average age of Male and Female Employees.

        System.out.println("-- Average age of Male and Female--");
        Map<String, Double> averageAgeMaleFemale=employeeList.stream().collect(Collectors.groupingBy(gender->gender.getGender(), Collectors.averagingInt(age-> age.getAge())));
        averageAgeMaleFemale.forEach((key,value)-> System.out.println(key+ ": "+value));

        //4. Get the Names of employees who joined after 2015.
        System.out.println("-- Joined After 2015--");
        List<String> names=employeeList.stream().filter(year->year.getYearOfJoining() >2015).map(name-> name.getName()).collect(Collectors.toList());
        names.forEach(System.out::println);


        //5. Count the number of employees in each department.
        System.out.println("-- Count Employee in Each Department --");
        Map<String, Long> countEachDepartment= employeeList.stream().collect(Collectors.groupingBy(dept-> dept.getDepartment(), Collectors.counting()));
        countEachDepartment.forEach((key,value)-> System.out.println(key+ " : "+value));


        //6. Find out the average salary of each department.
        System.out.println("-- Average Salary of Each Departments");
        Map<String, Double> averageSalary= employeeList
                                         .stream()
                                         .collect(Collectors.groupingBy(dept-> dept.getDepartment(), Collectors.averagingDouble(sal-> sal.getSalary())));
        //7. Find out the oldest employee, his/her age and department?

        System.out.println("-- Old Employee Details--");
        Employee oldEmployee= employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();

        System.out.println("Name: "+ oldEmployee.getName());
        System.out.println("Department : "+ oldEmployee.getDepartment());


        //8. Find out the average and total salary of the organization?

        System.out.println("-- Total Salary --");
        double totalSalary= employeeList.stream().map(Employee::getSalary).reduce(0.00, (a,b)-> a+b);
        System.out.println("Total Salary: "+totalSalary);

        //9. List down the employees of each department.

        System.out.println("-- Employee of Each Department --");
        Map<String , List<Employee>> everyDeptEmployee= employeeList.stream().collect(Collectors.groupingBy(dept-> dept.getDepartment()));
        everyDeptEmployee.forEach((key, value)-> System.out.println(key+"::"+value));

        //10. Find out the highest experienced employees in the organization?
        System.out.println("-- Highest Experience --");
        Employee highestExperience= employeeList.stream().min(Comparator.comparing(year-> year.getYearOfJoining())).get();
        System.out.println("Highest Experience: "+ highestExperience.getName());



    }
}
