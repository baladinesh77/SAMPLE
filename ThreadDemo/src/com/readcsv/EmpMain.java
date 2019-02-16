package com.readcsv;

import java.io.IOException;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Employee> empList = DataManager.getInstance().load("D:\\data.csv");

		for (Employee e : empList) {
			System.out.println(e.getId() + " : " + e.getName() + " : " + e.getDesignation());
		}

		DataManager.getInstance().save("D:\\copyData.csv", empList);

	}

}
