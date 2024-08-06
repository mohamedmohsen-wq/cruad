package com.example.crud.model.mapper;



import java.util.List;
import java.util.Optional;

import org.mapstruct.Mapper;

import com.example.crud.model.DTO.testDto;
import com.example.crud.model.DTO.updatetestDto;
import com.example.crud.model.DTO.responstestDto;
import com.example.crud.model.DTO.raqtestDto2;
import com.example.crud.model.Entity.testEntity;

@Mapper(componentModel = "spring")
public interface mapper {
	testDto dto(testEntity entity);
	testEntity toEntity(testDto dto);
	
    List<testEntity> entity(List<testDto> dto);
     List<testEntity> dto(List<testEntity> entity);
	
	
	List<testEntity> entitye(List<responstestDto> dto);
	List<responstestDto> dtol(List<testEntity> entitye);
	
	testEntity reentity(raqtestDto2 dto);	
    responstestDto redto(testEntity reentity);
    
    updatetestDto updatedto(testEntity entity);
	testEntity updatetoEntity(updatetestDto dto);

}
