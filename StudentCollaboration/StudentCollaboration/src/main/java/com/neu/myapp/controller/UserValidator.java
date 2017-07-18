package com.neu.myapp.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.neu.myapp.pojo.Person;
import com.neu.myapp.pojo.User;



public class UserValidator implements Validator{

	private Pattern pattern;  
	 private Matcher matcher;  
	String STRING_PATTERN = "[a-zA-Z]+";
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"  
			   + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	String AGE_PATTERN = "^(1[8-9]|[2-5][0-9]|6[0-5])$"; 
	String USERNAME_PASS_PATTERN = "^[a-zA-Z0-9_-]{3,15}$";
	
	public UserValidator() {
		// TODO Auto-generated constructor stub
	}

	public boolean supports(Class aClass)
    {
        return aClass.equals(Person.class);
    }

    public void validate(Object obj, Errors errors)
    {
        Person person = (Person) obj;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.invalid.user", "First Name Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.invalid.user", "Last Name Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "error.invalid.user", "Age Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "error.invalid.user", "Gender Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.invalid.user", "Email Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.invalid.user", "User Name Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.invalid.password", "Password Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "error.invalid.user", "Role Required");
        //ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "error.invalid.user", "Role Required");
        
        if(!(person.getFirstName() != null && person.getFirstName().isEmpty())){
        	 pattern = Pattern.compile(STRING_PATTERN);  
        	   matcher = pattern.matcher(person.getFirstName());
        	   if (!matcher.matches()) {  
        		    errors.rejectValue("firstName", "firstName.containNonChar",  
        		      "Enter a valid Firstname");  
        		   }  
        }
        
        if(!(person.getLastName() != null && person.getLastName().isEmpty())){
       	 pattern = Pattern.compile(STRING_PATTERN);  
       	   matcher = pattern.matcher(person.getLastName());
       	   if (!matcher.matches()) {  
       		    errors.rejectValue("lastName", "lastName.containNonChar",  
       		      "Enter a valid Lastname");  
       		   }  
       }
        
        if (!(person.getEmail() != null && person.getEmail().isEmpty())) {  
        	   pattern = Pattern.compile(EMAIL_PATTERN);  
        	   matcher = pattern.matcher(person.getEmail());  
        	   if (!matcher.matches()) {  
        	    errors.rejectValue("email", "email.incorrect",  
        	      "Enter a correct email");  
        	   }  
        	  } 
        
        if (!(person.getUsername() != null && person.getUsername().isEmpty())) {  
     	   pattern = Pattern.compile(USERNAME_PASS_PATTERN);  
     	   matcher = pattern.matcher(person.getUsername());  
     	   if (!matcher.matches()) {  
     	    errors.rejectValue("username", "username.incorrect",  
     	      "Username should be 3-15 charcters(Hyphen and underscore allowed)");  
     	   }  
     	  } 
        if (!(person.getPassword() != null && person.getPassword().isEmpty())) {  
      	   pattern = Pattern.compile(USERNAME_PASS_PATTERN);  
      	   matcher = pattern.matcher(person.getPassword());  
      	   if (!matcher.matches()) {  
      	    errors.rejectValue("password", "password.incorrect",  
      	      "Password should be 3-15 charcters(Hyphen and underscore allowed)");  
      	   }  
      	  } 
         
    }

}
