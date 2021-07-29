package com.danut.springgraphql.footballstatistics.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
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
