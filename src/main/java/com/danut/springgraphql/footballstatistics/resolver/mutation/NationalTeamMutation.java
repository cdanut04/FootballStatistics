package com.danut.springgraphql.footballstatistics.resolver.mutation;

import com.danut.springgraphql.footballstatistics.model.NationalTeam;
import com.danut.springgraphql.footballstatistics.repository.NationalTeamRepository;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class NationalTeamMutation implements GraphQLMutationResolver {

    public final NationalTeamRepository repository;

    public NationalTeamMutation(NationalTeamRepository repository) {
        this.repository = repository;
    }

    public NationalTeam createNationalTeam(NationalTeam nationalTeam) {
        return repository.save(nationalTeam);
    }
}
