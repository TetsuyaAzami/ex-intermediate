package com.example.exintermediate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Hotel {
	private String hotelName;
	private String nearestStation;
	private Integer price;
}
