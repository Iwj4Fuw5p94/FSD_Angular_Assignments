package com.hexaware.springrest.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.springrest.DTO.WorkExperienceDTO;
import com.hexaware.springrest.entity.WorkExperience;
import com.hexaware.springrest.service.IWorkExService;
import com.hexaware.springrest.service.WorkExServiceImpl;

@RestController
@RequestMapping("/api/employer")
public class WorkExController {

	Logger logger = LoggerFactory.getLogger(WorkExController.class);
	@Autowired
	private IWorkExService exService;

	@PostMapping("/add")
	public WorkExperience addExperience(@RequestBody WorkExperienceDTO wExperienceDTO) {
		boolean flag=WorkExServiceImpl.validateEmployee(wExperienceDTO);
		WorkExperience we = null;
		logger.info("controller executed");

		if (flag){
			we = exService.addExperience(wExperienceDTO);
		}
		else {
			logger.info("controoler failed to execute ");
		}

		return we;
	}

	@PutMapping("/update/{experienceId}")
	public WorkExperience updateExperience(@RequestBody WorkExperience workExperience,@PathVariable Long experienceId) {
		return exService.updateExperience(workExperience);
	}

	@GetMapping("/get/{experienceId}")
	public WorkExperience getExperienceById(@PathVariable Long experienceId) {
		return exService.getExperienceByI(experienceId);
	}

	@DeleteMapping("/delete/{experienceId}")
	public String deleteExperience(@PathVariable Long experienceId) {
		return exService.deleteExperience(experienceId);
	}

	@GetMapping("/getall")
	public List<WorkExperience> getAllExperiences() {
		return exService.getAllExperience();
	}

}
