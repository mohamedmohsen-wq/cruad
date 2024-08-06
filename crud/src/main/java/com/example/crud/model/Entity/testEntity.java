package com.example.crud.model.Entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "note")
public class testEntity {
	@Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
		private long id;
		private String summary;
		@Column(name = "start_time")
		private String starttime;
		@Column(name = "end_time")
		private String endtime;
		private String status;
		
		@Column(name = "creat_At")
		@CreationTimestamp 	
		private LocalDateTime creatAt;
		@Column(name = "update_At")
		@UpdateTimestamp
		private LocalDateTime updateAt;
		
	

}
