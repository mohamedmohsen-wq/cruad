package com.example.crud.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.crud.model.DTO.testDto;
import com.example.crud.model.DTO.updatetestDto;
import com.example.crud.model.DTO.responstestDto;
import com.example.crud.model.DTO.raqtestDto2;
import com.example.crud.model.Entity.testEntity;

@Service
public interface testService {
	responstestDto saveproducte( raqtestDto2 dto);
	
	

	responstestDto findbyid(long id);
	List<responstestDto> findAll(testEntity entity);
	
	
	
	updatetestDto update(raqtestDto2 dto);
	
	String delete(long id);
}
