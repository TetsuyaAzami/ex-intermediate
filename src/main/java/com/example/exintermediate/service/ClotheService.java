package com.example.exintermediate.service;

import java.util.List;
import com.example.exintermediate.domain.Clothe;
import com.example.exintermediate.repository.ColotheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClotheService {
	@Autowired
	private ColotheRepository repository;

	public List<Clothe> searchByColorAndGender(String color, Integer gender) {
		return repository.searchByColorAndGender(color, gender);
	}
}
