package com.example.crud.model.DTO;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.example.crud.model.Entity.testEntity;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class updatetestDto {
	
	 
	private long id;
	private String summary;
	private String starttime;
	private String endtime;
	private String status;	


	

}
