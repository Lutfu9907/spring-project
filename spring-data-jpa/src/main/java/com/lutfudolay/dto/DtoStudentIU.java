package com.lutfudolay.dto;

import java.sql.Date;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {

	@NotEmpty(message = "firstname alanı boş bırakılamaz")
	@Min(value = 3,message = "firstname minimum 3 karakter olmalıdır")
	@Max(value = 10,message = "firstname alanı maximum 10 karakter olmalıdır")
	private String firstName;
	
	@Size(min = 3,max = 30)
	private String lastName;
	private Date birthOfDate;
	
	@Email(message = "Email formatında bir adres giriniz")
	private String email;
}
