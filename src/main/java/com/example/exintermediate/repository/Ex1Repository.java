package com.example.exintermediate.repository;

import java.util.List;
import com.example.exintermediate.domain.BaseballTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class Ex1Repository {
	private final RowMapper<BaseballTeam> BASEBALL_TEAM_ROW_MAPPER = (rs, i) -> {
		BaseballTeam baseballTeam = new BaseballTeam();
		baseballTeam.setId(rs.getInt("id"));
		baseballTeam.setLeagueName(rs.getString("league_name"));
		baseballTeam.setTeamName(rs.getString("team_name"));
		baseballTeam.setHeadquarters(rs.getString("headquarters"));
		baseballTeam.setInauguration(rs.getString("inauguration"));
		baseballTeam.setHistory(rs.getString("history"));
		return baseballTeam;
	};

	@Autowired
	private NamedParameterJdbcTemplate template;

	public List<BaseballTeam> findAll() {
		String sql =
				"SELECT id,league_name,team_name, headquarters, inauguration, history FROM teams ORDER BY inauguration ASC;";
		List<BaseballTeam> baseballTeamList = template.query(sql, BASEBALL_TEAM_ROW_MAPPER);
		return baseballTeamList;
	}

	public BaseballTeam load(Integer id) {
		String sql =
				"SELECT id,league_name,team_name, headquarters, inauguration, history FROM teams WHERE id = :id;";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		List<BaseballTeam> baseballTeamList = template.query(sql, param, BASEBALL_TEAM_ROW_MAPPER);
		if (baseballTeamList.size() == 0) {
			return null;
		} else {
			return baseballTeamList.get(0);
		}
	}
}
