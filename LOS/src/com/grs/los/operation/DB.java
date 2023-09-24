package com.grs.los.operation;

import java.util.ArrayList;

import com.grs.los.customer.Customer;
import com.grs.los.customer.PersonalInformation;

public interface DB {
	
	public static ArrayList<Customer> getNegativeCustomers() {
		
		ArrayList<Customer> negativeCustomers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setId(1010);
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName("Tim");
		pd.setLastName("Jasckson");
		pd.setPhone("87654678");
		pd.setPanCard("KJKU28989");
		pd.setVoterId("9876543567");
		pd.setEmail("tim@gmail.com");
		customer.setPersonal(pd);
		negativeCustomers.add(customer);
		
		customer = new Customer();
		
		customer.setId(1012);
		PersonalInformation pd2 = new PersonalInformation();
		pd2.setFirstName("Tom");
		pd2.setLastName("Cruise");
		pd2.setPhone("87654678");
		pd2.setPanCard("KJHKCE8765");
		pd2.setVoterId("8976543");
		pd2.setEmail("tom@gmail.com");
		customer.setPersonal(pd2);
		negativeCustomers.add(customer);
		
		return negativeCustomers;
		
	}

}
