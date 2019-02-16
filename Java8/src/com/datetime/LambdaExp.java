package com.datetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> empList = new ArrayList<>();
				
		empList.add(new Product(1213,"Mobile","maanger",15213.00));
		empList.add(new Product(130,"tablet","maanger",15213.00));
		empList.add(new Product(13,"battery","maanger",15213.00));
		empList.add(new Product(213,"hjkjk","maanger",15213.00));
		empList.add(new Product(613,"srikanth","maanger",15213.00));
		
		//Collections.sort(empList, (emp1, emp2) -> emp1.getId() - emp2.getId());
		Collections.sort(empList, (emp1, emp2) -> { return emp1.getName().compareTo(emp2.getName());});		
		
		for (Product Product : empList) {
			System.out.println(Product);
			
		}
		/*//Product[] emp = (Product[]) empList.toArray();
		Product[] emp = new Product[] {
				new Product(1213,"asadf","maanger",15213.00),
				new Product(130,"asdf","maanger",15213.00),
				new Product(13,"asdf","maanger",15213.00),
				new Product(213,"sadf","maanger",15213.00)
				
		};
		
		Arrays.sort(emp, (emp1, emp2) -> { return emp1.getName().compareTo(emp2.getName());});
		for (Product Product : emp) {
			System.out.println(Product);
			
		}*/
		
	}

}

