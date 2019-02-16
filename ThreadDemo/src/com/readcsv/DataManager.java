package com.readcsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataManager {
	
	private static DataManager dataManager = null;
	
	private DataManager () {
		 
	}
	
	public static DataManager getInstance() {
		if(dataManager == null) {
			dataManager = new DataManager();
		} 
		return dataManager;
	}

	public List<Employee> load(String filename) throws IOException {
		List<Employee> empList = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			
			String line = br.readLine();
			while(line != null) { 
				Employee emp = DataManager.toObject(line);
				empList.add(emp);
				
				line = br.readLine();
			} 
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		return empList;
		
	}
	
	public void save(String filename, List<Employee> emps) throws IOException {
		
		// open bufferedwriter for given file
		//for each 3 in emps
		//convert e into string using tostring
		//and write it to bufferedwriter
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
			for (Employee e : emps) {
				bw.write(DataManager.toString(e));
			}
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	private static Employee toObject(String line) {
		
		String[] fields = line.split(",");
		int id = Integer.parseInt(fields[0].trim());
		String name = fields[1].trim();
		String designation = fields[2].trim();
		double sal = Double.parseDouble(fields[3].trim());
		
		return new Employee(id,name,designation, sal);
	}
	
	private static String toString(Employee emp) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(emp.getId()).append(",").append(emp.getName()).append(",").append(emp.getDesignation()).append(",")
				.append(emp.getSalary()).append("\n");
		
		return sb.toString();
		
	}
}
