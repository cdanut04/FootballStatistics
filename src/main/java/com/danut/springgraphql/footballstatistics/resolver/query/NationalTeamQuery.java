package com.danut.springgraphql.footballstatistics.resolver.query;

import com.danut.springgraphql.footballstatistics.model.NationalTeam;
import com.danut.springgraphql.footballstatistics.repository.NationalTeamRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class NationalTeamQuery implements GraphQLQueryResolver {
    private final NationalTeamRepository repository;

    public NationalTeamQuery(NationalTeamRepository repository) {
        this.repository = repository;
    }

    public List<NationalTeam> allNationalTeams() {
        return repository.findAll();
    }

    public Optional<NationalTeam> getNationalTeam(String id) {
        return repository.findById(id);
    }
}
