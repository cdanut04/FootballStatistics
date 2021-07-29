package com.danut.springgraphql.footballstatistics.dto;

import com.danut.springgraphql.footballstatistics.model.Coach;
import com.danut.springgraphql.footballstatistics.model.Player;
import lombok.Data;

import java.util.List;

@Data
public class FootballTeam {
    private String id;
    private String name;
    private int fifaRanking;
    private double averageAge;
    private Coach coach;
    private Player captain;
    private List<Player> players;
}
