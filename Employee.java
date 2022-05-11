package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;


class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;
    private int age;
    private String joiningDate;
 
    public Employee(String name,double salary, int age,String joiningDate)
    {
        this.name = name;
        this.salary=salary;
        this.age = age;
        this.joiningDate=joiningDate;
    }
 

    public String getName() {
        return name;
    }
    public double getSalary() {
    	return salary;
    	
    }
 
    public int getAge() {
        return age;
    }
    public String getJoiningDate() {
    	return joiningDate;
    }
    
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", joiningDate=" + joiningDate + "]";
	}

	@Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args)
    {
        List<Employee> emp = new ArrayList<>(Arrays.asList(new Employee("Sachin",10000, 33,"10-Feb-2010"),
                                                           new Employee("Dhoni",40000, 34,"11-Jan-1988"),
                                                           new Employee("Virat",25000, 30,"08-FEB-1985"),
                                                           new Employee("Rohit",30000,33,"23-DEC-1992"),
                                                           new Employee("Dhawan",10000,25,"12-Aug-2020")));         
 
        Collections.sort(emp);
        System.out.println(emp);
    }

}
