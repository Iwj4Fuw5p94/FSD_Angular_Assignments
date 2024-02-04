package com.hexaware.springrest.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.ArgumentMatchers.longThat;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrest.entity.WorkExperience;

import ch.qos.logback.classic.Logger;
import jakarta.validation.constraints.Pattern.Flag;

@SpringBootTest
class WorkExServiceImplTest {
	
	@Autowired
	IWorkExService service;
	
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddExperience() {
//		WorkExperience weExperience= new WorkExperience(109,"nucleus",LocalDate.parse("2000-10-10"),LocalDate.parse("2002-10-10"),20000,"sdfghjk");
//	WorkExperience workExperience=	service.addExperience(weExperience);
//	assertNotNull(workExperience);
		
	}

	@Test
	void testUpdateExperience() {
		
		
	}

	@Test
	void testGetExperienceByI() {
		long experienceID=108;
		WorkExperience emp = service.getExperienceByI(experienceID);
		assertNotEquals(108, emp.getExperienceId());
		
	}

	@Test
	void testDeleteExperience() {
		Long experienceID=(long) 108;
		service.deleteExperience(experienceID);
		assertTrue(true);
		
		
		
	}

	@Test
	void testGetAllExperience() {
		List list=service.getAllExperience();
		boolean flag=false;
		if(list.size()>0) {
			flag=true;
		}
		assertTrue(flag);
	}

}
