package com.SpringRest.Rest3.WebLayer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRest.Rest3.Model.Employee;

@RestController
@RequestMapping("/api3")
public class FirstController 
{

	@GetMapping("/getData")
	public ResponseEntity sendData()
	{
		Employee emp=new Employee(18,"Virat","Batting Coach",450000);
		
		return new ResponseEntity<Employee>(emp,HttpStatus.OK );
	}
	
	@PostMapping("/save")
	public ResponseEntity<String> getData1(@RequestBody Employee emp)
	{
		System.out.println(emp);
		return new ResponseEntity<String>( "Data Recieved Successfully",HttpStatus.OK ); 
	}
	
}
