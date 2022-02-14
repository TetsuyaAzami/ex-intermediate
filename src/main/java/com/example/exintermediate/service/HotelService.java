package com.example.exintermediate.service;

import java.util.List;
import com.example.exintermediate.domain.Hotel;
import com.example.exintermediate.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
	@Autowired
	private HotelRepository repository;

	public List<Hotel> searchByLessThanPrice(Integer price) {
		return repository.searchByLessThanPrice(price);
	}

	public List<Hotel> findAll() {
		return repository.findAll();
	}
}
