package com.danut.springgraphql.footballstatistics.repository;

import com.danut.springgraphql.footballstatistics.model.NationalTeam;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalTeamRepository extends MongoRepository<NationalTeam,String> {
}
