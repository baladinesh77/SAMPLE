package com.funtionalintrfce;

import java.util.function.Consumer;

public class Consumercls {

	public static void main(String[] args) {

		int [] data= {10, 20 ,30 ,40 ,50 ,60};
		Person per= new Person("Dinesh", "degala ", "bala");
		
		
		show(per, (x)->System.out.println("hello"+per.getFirstName()));
		
	}
		static void show(Person p,Consumer<Person> consumer) {
			consumer.accept(p);
			
		}
	}


	
