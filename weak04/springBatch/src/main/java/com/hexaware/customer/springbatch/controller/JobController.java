package com.hexaware.customer.springbatch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	JobLauncher JobLauncher;
	
	@Autowired
	Job job;
	
	@GetMapping("/imports-customers")
	public void importCustomersCsvToDbJon() {
		
//		jobparameter we have to pass parameter 
		JobParameters jobParameters=new JobParameters()
				.addLong("startAt",System.currentTimeMillis()).toJobParameters();
				
		try {
			
		} catch (Exception | ) {
			e.printStackTrace();
		}
		
		
		
	}

}
