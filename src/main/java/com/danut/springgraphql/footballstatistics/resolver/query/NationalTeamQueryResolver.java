package com.danut.springgraphql.footballstatistics.resolver.query;

import com.danut.springgraphql.footballstatistics.dto.FootballTeam;
import com.danut.springgraphql.footballstatistics.mapper.Mapper;
import com.danut.springgraphql.footballstatistics.model.NationalTeam;
import com.danut.springgraphql.footballstatistics.repository.NationalTeamRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class NationalTeamQueryResolver implements GraphQLQueryResolver {
    private final NationalTeamRepository repository;
    private final Mapper mapper;

    public NationalTeamQueryResolver(NationalTeamRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<FootballTeam> allNationalTeams() {
        List<NationalTeam> nationalTeams = repository.findAll();
        return nationalTeams.stream()
                .map(mapper::toTeam)
                .collect(Collectors.toList());
    }

    public Optional<FootballTeam> getNationalTeam(String id) {
        Optional<NationalTeam> nationalTeam = repository.findById(id);
        return nationalTeam.map(mapper::toTeam);
    }
}
