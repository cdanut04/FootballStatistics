package com.danut.springgraphql.footballstatistics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coach {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
}
