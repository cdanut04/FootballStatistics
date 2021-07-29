package com.danut.springgraphql.footballstatistics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    private String id;
    private String firstName;
    private String lastName;
    private String dob;
    private int age;
    private double height;
    private LocalDate debut;
    private String position;
    private int caps;
    private int goals;
    private Club club;
}
