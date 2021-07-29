package com.danut.springgraphql.footballstatistics.dto;

import lombok.Data;

@Data
public class NationalTeamInput {
    private String id;
    private String name;
    private int fifaRanking;
    private double averageAge;
}
