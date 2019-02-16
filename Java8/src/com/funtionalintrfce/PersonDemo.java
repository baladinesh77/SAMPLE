package com.funtionalintrfce;

import java.util.function.Consumer;
import java.util.function.Function;

public class PersonDemo {

	public static void main(String[] args) {

		/*Person p= new Person("srinadh", "gottimukkala", "babu");
			p.print((x) -> x.getFirstName() + " " + x.getLastName());
			
		Person p1 =new Person("bala", "kumar", "degala");
		p1.print((x) -> x.getFirstName() + " " + x.getMiddleName());
		*/
	
		Person p2 = new Person("Ramu","sita","Gottipati");
		/*p2.print(new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				System.out.println(t.getFirstName() + " "+t.getMiddleName());
				
			}
		});
		*/
		Person p3 = new Person("bala","dinesh","degala");
		//p3.print(t -> System.out.println(t.getFirstName() + " "+t.getMiddleName()));
		
		Function<Person, String> fun=((x)->x.getFirstName() + " "+x.getMiddleName());
		p3.print(fun);
		//System.out.println("checking function condumer interrface"+fun);
		//p3.print((t) -> p3.getFirstName() + " "+p3.getMiddleName());
		
		
		
		
	}
	
	}



