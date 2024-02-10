package com.hexaware.customer.springbatch.config;

import org.springframework.batch.item.ItemProcessor;

import com.hexaware.customer.springbatch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Long>{

	
	
	@Override
	public Customer process(Customer item) throws Exception {
		if(item.getCountry().equals("Indonesia")) {
			return item;
		}	
		return item;
	}

}
