package com.neu.myapp.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.neu.myapp.pojo.ApplicantProfile;
import com.neu.myapp.pojo.Person;

public class ApplicantValidator implements Validator {

	public ApplicantValidator() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean supports(Class aClass)
    {
        return aClass.equals(ApplicantProfile.class);
    }
	
	public void validate(Object obj, Errors errors)
	{
		ApplicantProfile applicant = (ApplicantProfile) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.invalid.applicant", "First Name Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.applicant", "Last Name Required");
	}
}
