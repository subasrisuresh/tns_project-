package com.tns.Certificateservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Certificate_Service 
{
	@Autowired
	private Certificate_Service_Repository repo;
	
	public List<Certificate> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Certificate certi)
	{
		repo.save(certi);
	}
	
	public Certificate get(Integer c_id)
	{
		return repo.findById(c_id).get();
	}
	public void delete(Integer c_id)
	{
		repo.deleteById(c_id);
	}
	
}
