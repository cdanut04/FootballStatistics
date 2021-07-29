package com.danut.springgraphql.footballstatistics.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Club {
    private String id;
    private String name;
    private String country;
}
