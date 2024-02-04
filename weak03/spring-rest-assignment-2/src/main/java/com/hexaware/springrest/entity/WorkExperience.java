package com.hexaware.springrest.entity;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;


@Entity

public class WorkExperience {
	
	@Id
	@Min(1)
	private long experienceId;
	@NotEmpty
	private String companyName;
	@NotNull
	private LocalDate startDate;
	@NotNull
	private LocalDate endDate;
	@NotNull
	private double salary;
	@NotEmpty
	private String description;
	
	public WorkExperience() {}

	public WorkExperience(long experienceId, String companyName, LocalDate startDate, LocalDate endDate, double salary,
			String description) {
		super();
		this.experienceId = experienceId;
		this.companyName = companyName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salary = salary;
		this.description = description;
	}

	public long getExperienceId() {
		return experienceId;
	}

	public void setExperienceId(long experienceId) {
		this.experienceId = experienceId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "WorkExperience [experienceId=" + experienceId + ", companyName=" + companyName + ", startDate="
				+ startDate + ", endDate=" + endDate + ", salary=" + salary + ", description=" + description + "]";
	}
	
}
