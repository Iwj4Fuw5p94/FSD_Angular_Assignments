package com.hexaware.springrest.service;

import java.util.List;

import org.springframework.data.annotation.CreatedBy;

import com.hexaware.springrest.DTO.WorkExperienceDTO;
import com.hexaware.springrest.entity.WorkExperience;

public interface IWorkExService {
	
	public WorkExperience addExperience(WorkExperienceDTO workExperienceDTO);
	public WorkExperience updateExperience(WorkExperience workExperience);
	public WorkExperience getExperienceByI(Long experienceId);
	public String deleteExperience(Long experienceId);
	public List<WorkExperience> getAllExperience();

}
