package com.hexaware.springrest.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.DTO.WorkExperienceDTO;
import com.hexaware.springrest.entity.WorkExperience;
import com.hexaware.springrest.repository.RepoWorkEx;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class WorkExServiceImpl implements IWorkExService {
	
	Logger logger=LoggerFactory.getLogger(WorkExServiceImpl.class);
	
	
	@Autowired
	RepoWorkEx repo;

	@Override
	public WorkExperience addExperience(WorkExperienceDTO workExperienceDTO) {	
		WorkExperience we=new WorkExperience();
		logger.info("workexperience service is added in add service");
		we.setExperienceId(workExperienceDTO.getExperienceId());

		we.setCompanyName(workExperienceDTO.getCompanyName());
		we.setStartDate(workExperienceDTO.getStartDate());
		we.setEndDate(workExperienceDTO.getEndDate());
		we.setSalary(workExperienceDTO.getSalary());
		we.setDescription(workExperienceDTO.getDescription());
		
		return repo.save(we);
	}

	@Override
	public WorkExperience updateExperience(WorkExperience workExperience) {
		// TODO Auto-generated method stub
		return repo.save(workExperience);
	}

	@Override
	public WorkExperience getExperienceByI(Long experienceId) {
		// TODO Auto-generated method stub
		return repo.findById(experienceId).orElse(null);
	}

	@Override
	public String deleteExperience(Long experienceId) {
		repo.deleteById(experienceId);
		return "record delete";
	}

	@Override
	public List<WorkExperience> getAllExperience() {
		
		return repo.findAll();
	}
	
	
	public static boolean validateEmployee(WorkExperienceDTO WE){
		boolean flag=false;
		String ename=WE.getCompanyName();
		String description=WE.getDescription();
		if(WE.getExperienceId()>99 && WE.getSalary()>1000 && description.equals(description.toLowerCase())&&ename.equals(ename.toUpperCase())) {
			flag=true;
		}
		return flag;
		
		
	}


}
