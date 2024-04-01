package com.microservice.EmpOfficeDetails.request;

import java.util.Date;

import com.microservice.EmpOfficeDetails.customValidation.AgeAbove;
import com.microservice.EmpOfficeDetails.customValidation.ValidPhoneNumber;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PersonalDetailRequest {
	//private Long personalId;
	   @NotBlank(message = "Employee name is required")
		private String name;
		
	    @NotNull(message = "Date of birth is required")
	    @AgeAbove(message = "Age must be above 18")
		private Date dob;
	    
	    @NotBlank(message = "Address is required")
		private String address;
	    
		@NotNull(message = "Phone number is required")
	    @ValidPhoneNumber
		private Long phoneNo;
		
		@NotBlank(message = "Email is required")
	    @Email(message = "Email should be valid")
		private String email;
		
		@NotBlank(message = "Salary is required")
		private String salary;
		
	public PersonalDetailRequest(EmployeeAllDataRequest employeeAllDataRequest) {
		//this.personalId=employeeAllDataRequest.getp
		this.name = employeeAllDataRequest.getEmployeeName();
		this.dob = employeeAllDataRequest.getDob();
		this.address = employeeAllDataRequest.getAddress();
		this.phoneNo = employeeAllDataRequest.getPhoneNo();
		this.email = employeeAllDataRequest.getEmail();
		this.salary = employeeAllDataRequest.getSalary();
	}
	
	
}
