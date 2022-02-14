package com.example.exintermediate.controller;

import java.util.List;
import com.example.exintermediate.domain.Clothe;
import com.example.exintermediate.service.ClotheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("search-clothes")
public class ClothesController {
	@Autowired
	private ClotheService service;

	@RequestMapping("")
	public String index() {
		return "search-clothes";
	}

	@RequestMapping("search")
	public String search(String color, Integer gender, Model model) {
		List<Clothe> clotheList = service.searchByColorAndGender(color, gender);
		model.addAttribute("clotheList", clotheList);
		return "search-clothes";
	}
}
