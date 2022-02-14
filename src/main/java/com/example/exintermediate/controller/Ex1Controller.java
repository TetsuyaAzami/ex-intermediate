package com.example.exintermediate.controller;

import java.util.List;
import com.example.exintermediate.domain.BaseballTeam;
import com.example.exintermediate.form.BaseballTeamForm;
import com.example.exintermediate.service.Ex1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("baseball-team")
public class Ex1Controller {

	@ModelAttribute
	public BaseballTeamForm setUpBaseballTeamForm() {
		return new BaseballTeamForm();
	}

	@Autowired
	private Ex1Service service;

	@RequestMapping("showList")
	public String index(Model model) {
		List<BaseballTeam> baseballTeamList = service.showList();
		model.addAttribute("baseballTeamList", baseballTeamList);
		return "baseball-team-list";
	}

	@RequestMapping("showDetail")
	public String showDetail(Integer id, Model model) {
		BaseballTeam baseballTeam = service.showDetail(id);
		model.addAttribute("baseballTeam", baseballTeam);
		return "baseball-team-detail";
	}
}
