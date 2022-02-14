package com.example.exintermediate.controller;

import java.util.List;
import com.example.exintermediate.domain.Hotel;
import com.example.exintermediate.form.HotelForm;
import com.example.exintermediate.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hotel-search")
public class HotelSearchController {

	@Autowired
	private HotelService service;

	@ModelAttribute
	private HotelForm setUpHotelForm() {
		return new HotelForm();
	}

	@RequestMapping("")
	public String index() {
		return "hotel-search";
	}

	@RequestMapping("search")
	public String search(String price, Model model) {
		List<Hotel> hotelList = null;
		if (price.isEmpty()) {
			hotelList = service.findAll();
		} else {
			try {
				hotelList = service.searchByLessThanPrice(Integer.parseInt(price));
			} catch (Exception e) {
				model.addAttribute("numberFormatError", "整数で指定してください");
				return "hotel-search";
			}
		}
		model.addAttribute("hotelList", hotelList);
		return "hotel-search";
	}
}
