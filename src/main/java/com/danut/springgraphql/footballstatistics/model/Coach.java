package com.danut.springgraphql.footballstatistics.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coach {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;
}
