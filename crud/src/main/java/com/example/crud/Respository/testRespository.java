package com.example.crud.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crud.model.Entity.testEntity;

public interface testRespository  extends JpaRepository<testEntity,Long>{

	

}
