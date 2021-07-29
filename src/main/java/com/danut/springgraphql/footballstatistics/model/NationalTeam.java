package com.danut.springgraphql.footballstatistics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "footballTeams")
public class NationalTeam {
    private String id;
    private String name;
    private int fifaRanking;
    private double averageAge;
    private Coach coach;
    private Player captain;
    private List<Player> players;
}
