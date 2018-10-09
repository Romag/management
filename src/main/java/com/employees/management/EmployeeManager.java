package com.employees.management;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeManager {
	private List<? extends Employee> employees;
	
	public EmployeeManager() {
		employees = new LinkedList<>();
	}
	
	public EmployeeManager(List<? extends Employee> employees) {
		this.employees = employees; 
	}
	
	public void sort() {
		employees.sort(new MyComparator<Employee>());
	}
	
	private class MyComparator<E extends Employee> implements Comparator<E> {

		@Override
		public int compare(E o1, E o2) {
			return o1.compareTo(o2);
		}
		
	}
	
	public void writeIntoFile(String fileName) {
		//TODO
	}
	
	/**
	 * Problem a
	 * Write into console first 5 employees from collection
	 */
	public void printFirstFive() {
		for(int i=0; i<5; i++)
			System.out.println(employees.get(i).toString());
	}
	
	/**
	 * Prints last 5 elements of arrat in natural order.
	 * From n-5 to n, where n-5 is fifth element of array counting from the end and n is the last one.
	 */
	public void printLastFive() {
		for(int i=employees.size()-3-1; i<employees.size(); i++)
			System.out.println(employees.get(i).getID());
	}
	
	/**
	 * Prints last 5 elements of arrat in reverse order.
	 * From n to n-5, where n-5 is fifth element of array counting from the end and n is the last one.
	 */
	public void printLastFiveInReverse() {
		for(int i=employees.size()-1; i>employees.size()-3-1; i--)
			System.out.println(employees.get(i).getID());
	}
	
	public void print() {
		for(Employee e : employees)
			System.out.println(e.toString());
		
		System.out.println();
	}
	
	public Employee[] getEmployeesAsArray() {
		return (Employee[]) employees.toArray();
	}
}