package com.danut.springgraphql.footballstatistics.resolver.mutation;

import com.danut.springgraphql.footballstatistics.dto.FootballTeam;
import com.danut.springgraphql.footballstatistics.dto.NationalTeamInput;
import com.danut.springgraphql.footballstatistics.mapper.Mapper;
import com.danut.springgraphql.footballstatistics.model.NationalTeam;
import com.danut.springgraphql.footballstatistics.repository.NationalTeamRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class NationalTeamMutationResolver implements GraphQLMutationResolver {

    public final NationalTeamRepository repository;
    private final Mapper mapper;

    public NationalTeamMutationResolver(NationalTeamRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public FootballTeam createNationalTeam(NationalTeamInput nationalTeamInput) {
        NationalTeam nationalTeam = mapper.toNationalTeam(nationalTeamInput);
        NationalTeam savedTeam = repository.save(nationalTeam);
        return mapper.toTeam(savedTeam);
    }
}
