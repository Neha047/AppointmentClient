package com.springProject_ms.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springProject_ms.Model.BookAppoint;
import com.springProject_ms.Repo.BookAppoint_repo;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AppointmentController {
	@Autowired
	public RestTemplate restTemp;
	
	@Autowired
	private BookAppoint_repo bookap;
	@PostMapping("/appointment")
	public Boolean bookAppoint(@RequestBody BookAppoint regist) {
		if(!regist.getName().equals("") && regist.getContact()!=0 && regist.getDate()!=null && !regist.getEmail().equals("") && !regist.getMessage().equals("")) {
		bookap.save(regist);
		return true;}
		return false;
	}
	@GetMapping("allappoint")
	public List<BookAppoint> getDetails() {
		
		return bookap.findAll();
		
	}
	
	@DeleteMapping("allapoint/delete/{bid}")  
	private void deleteBook(@PathVariable("bid") int bookid)   
	{  
	 bookap.deleteById(bookid);  
	
	}  
	
	@GetMapping("allapoint/update/{bid}")  
	private Optional<BookAppoint> getOne(@PathVariable("bid") int bookid)   
	{  
	return bookap.findById(bookid);  
	} 
	
	//get al user in appointment
	@GetMapping("registration")
	public List<Object> getPatient(){
		Object[] allappoint=restTemp.getForObject("http://patient-ms/registration", Object[].class);
		return Arrays.asList(allappoint);
		
	}
		
	

}
