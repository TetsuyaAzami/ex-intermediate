package com.example.exintermediate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Clothe {
	private Integer id;
	private String category;
	private String genre;
	private Integer gender;
	private String color;
	private Integer price;
	private String size;
}
