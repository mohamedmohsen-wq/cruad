package com.example.crud.Service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.crud.Respository.testRespository;
import com.example.crud.Service.testService;
import com.example.crud.model.DTO.testDto;
import com.example.crud.model.DTO.updatetestDto;
import com.example.crud.model.DTO.responstestDto;
import com.example.crud.model.DTO.raqtestDto2;
import com.example.crud.model.Entity.testEntity;
import com.example.crud.model.mapper.mapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Service
@RequiredArgsConstructor
@Slf4j
public class testServiceImp implements testService {
	private final testRespository repo;
	private final mapper maper;
	@Override
	public responstestDto saveproducte(raqtestDto2 dto) {
	        testEntity save=   this.maper.reentity(dto);
	        log.info(" save  : {} Status : {}   "+ dto.getStatus());
	      testEntity savefinsh=  this.repo.save(save);
		return this.maper.redto(savefinsh);
	}
	
	@Override
	public responstestDto findbyid(long id) {
		Optional<testEntity> find=this.repo.findById(id);
		 log.info(" find  : {}  "+ find );
          find.isPresent();
		responstestDto findby=this.maper.redto(find.get());
		 log.info(" findby  : {}   "+ findby + id);
		return findby;
	}

	@Override
	public List<responstestDto> findAll(testEntity entity) {
	 List<testEntity> findAll= this.repo.findAll();
	 List<responstestDto> findall=this.maper.dtol(findAll);
		return findall;
	}

	@Override
	public updatetestDto update(raqtestDto2 dto) {
		 testEntity update=   this.maper.reentity(dto);
	      testEntity updatefinsh=  this.repo.save(update);
		return this.maper.updatedto(updatefinsh);
	}

	@Override
	public String delete(long id) {
		this.repo.deleteById(id);
		return "Done delete by : " + id;
		
	}

	


	




}
