package com.bootcamp.dayone;

import com.bootcamp.dayone.exercise_five.Employee;
import com.bootcamp.dayone.exercise_four.SumOfEvenAndOdd;
import com.bootcamp.dayone.exercise_one.ReverseNumber;
import com.bootcamp.dayone.exercise_three.MathematicalExpression;
import com.bootcamp.dayone.exercise_two.ReverseString;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Log4j2
@SpringBootApplication
public class DayOneApplication {

	public static void main(String[] args) {
//		log.info("Exercise one");
//			int num = -12345;
//			System.out.println(ReverseNumber.reverseWhileLoop(num));
//			System.out.println(ReverseNumber.reverseForLoop(num));
//			System.out.println(ReverseNumber.reverseNumberRecWrapper(num));

		log.info("Exercise two");
			String string = "Hello World";
			System.out.println(ReverseString.reverseStringForLoop(string));
			System.out.println(ReverseString.reverseUsingStringBuilder(string));
//			System.out.println(ReverseString.reverseUsingStreamOfMethod(string));
//			System.out.println(ReverseString.reverseUsingIntStreamRangeMethod(string));
//			System.out.println(ReverseString.reverseUsingCharsMethod(string));

//		log.info("Exercise three");
//			MathematicalExpression mathematicalExpression = new MathematicalExpression();
//			mathematicalExpression.init();
//
//		log.info("Exercise four");
//			SumOfEvenAndOdd.init();
//
//		log.info("Exercise five");
//		List<Employee> employees = new ArrayList<>();
//		employees.add(new Employee("Alice", 50_000));
//		employees.add(new Employee("Bob", 60_000));
//		employees.add(new Employee("Charlie", 45_000));
//
//		// Sorting employees based on salary in ascending order
//		Collections.sort(employees, Comparator.comparingDouble(Employee::getSalary));
//
//		// Displaying sorted employees
//		System.out.println("Employees sorted by salary in ascending order:");
//		for (Employee emp : employees) {
//			System.out.println("Name: " + emp.getName() + ", Salary: " + emp.getSalary());
//		}
////		SpringApplication.run(DayOneApplication.class, args);
	}

}
