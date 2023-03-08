package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.home;

@Repository


public interface homeRepo extends JpaRepository<home, Integer> {
	
}