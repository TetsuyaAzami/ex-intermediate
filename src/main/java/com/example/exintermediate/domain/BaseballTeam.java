package com.example.exintermediate.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseballTeam {
	private Integer id;
	private String leagueName;
	private String teamName;
	private String headquarters;
	private String inauguration;
	private String history;

}
