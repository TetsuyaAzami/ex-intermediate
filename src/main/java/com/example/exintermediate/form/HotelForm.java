package com.example.exintermediate.form;

import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotelForm {
	private String hotelName;
	private String nearestStation;
	@Pattern(regexp = "^[0-9]+$", message = "整数で指定してください")
	private String price;
}
