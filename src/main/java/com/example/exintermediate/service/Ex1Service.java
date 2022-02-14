package com.example.exintermediate.service;

import java.util.List;
import com.example.exintermediate.domain.BaseballTeam;
import com.example.exintermediate.repository.Ex1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ex1Service {
	@Autowired
	private Ex1Repository repository;

	public List<BaseballTeam> showList() {
		return repository.findAll();
	}

	public BaseballTeam showDetail(Integer id) {
		return repository.load(id);
	}
}
