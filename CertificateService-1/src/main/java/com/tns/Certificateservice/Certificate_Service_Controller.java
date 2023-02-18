package com.tns.Certificateservice;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Certificate_Service_Controller
{
	@Autowired(required=true)
	private Certificate_Service service;
	
	@GetMapping("/certificateservice")
	public java.util.List<Certificate> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/certificateservice/{c_id}")
	public ResponseEntity<Certificate> get(@PathVariable Integer C_id)
	{
		try
		{
			Certificate certi=service.get(C_id);
			return new ResponseEntity<Certificate>(certi,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Certificate>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/certificateservice")
	public void add(@RequestBody Certificate certi)
	{
		service.save(certi);
	}
	
	@PutMapping("/certiservice/{c_id}")
	public ResponseEntity<?> update(@RequestBody Certificate certi, @PathVariable Integer C_id)
	{
		Certificate existcerti=service.get(C_id);
		service.save(existcerti);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/certificateservice/{c_id}")
	public void delete(@PathVariable Integer c_id)
	{
		service.delete(c_id);
	}
}