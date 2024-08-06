package com.example.crud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Respository.testRespository;
import com.example.crud.Service.imp.testServiceImp;
import com.example.crud.model.DTO.testDto;
import com.example.crud.model.DTO.updatetestDto;
import com.example.crud.model.DTO.responstestDto;
import com.example.crud.model.DTO.raqtestDto2;
import com.example.crud.model.Entity.testEntity;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/tests")
@RequiredArgsConstructor
public class testcontroller {
	private final testServiceImp servie;
	
	
	@PostMapping("/test")
	public responstestDto saveproducte(@RequestBody raqtestDto2 dto) {
		return this.servie.saveproducte(dto);
	}
	
	@GetMapping("/test/{id}")
	public responstestDto findbyid( @PathVariable(name = "id")long id) {
		
		return this.servie.findbyid(id);
		
		
	}
	@GetMapping("/test")
	public List<responstestDto> findAll(testEntity entity) {
		return this.servie.findAll(entity);
		
	}
	@PutMapping("/test")
	public updatetestDto update(@RequestBody raqtestDto2 dto) {
		return this.servie.update(dto);
	}
	@DeleteMapping("/test")
	public String delete(@RequestParam long Iddelete) {
		
		return this.servie.delete(Iddelete);
	}
	
	
	

}
