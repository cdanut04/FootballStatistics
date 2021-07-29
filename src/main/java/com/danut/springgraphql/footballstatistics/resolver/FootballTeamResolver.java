package com.danut.springgraphql.footballstatistics.resolver;

import com.danut.springgraphql.footballstatistics.dto.FootballTeam;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.stereotype.Component;

@Component
public class FootballTeamResolver implements GraphQLResolver<FootballTeam> {

    public float getTotalMarketValue(FootballTeam footballTeam){
        //slow and painful business logic here
        return 89.5f;
    }
}
