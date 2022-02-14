package com.example.exintermediate.repository;

import java.util.List;
import com.example.exintermediate.domain.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class HotelRepository {
	private final RowMapper<Hotel> HOTEL_SEARCH_ROW_MAPPER = (rs, i) -> {
		Hotel hotel = new Hotel();
		hotel.setHotelName(rs.getString("hotel_name"));
		hotel.setNearestStation(rs.getString("nearest_station"));
		hotel.setPrice(rs.getInt("price"));
		return hotel;
	};

	@Autowired
	private NamedParameterJdbcTemplate template;

	public List<Hotel> searchByLessThanPrice(Integer price) {

		String sql =
				"SELECT hotel_name,nearest_station,price FROM hotels WHERE price <= :price ORDER BY price DESC;";

		SqlParameterSource param = new MapSqlParameterSource().addValue("price", price);
		List<Hotel> hotelList = template.query(sql, param, HOTEL_SEARCH_ROW_MAPPER);
		return hotelList;
	}

	public List<Hotel> findAll() {
		String sql = "SELECT hotel_name,nearest_station,price FROM hotels ORDER BY price DESC;";
		List<Hotel> hotelList = template.query(sql, HOTEL_SEARCH_ROW_MAPPER);
		return hotelList;
	}
}
