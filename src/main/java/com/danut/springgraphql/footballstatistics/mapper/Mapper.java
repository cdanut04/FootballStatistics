package com.danut.springgraphql.footballstatistics.mapper;

import com.danut.springgraphql.footballstatistics.dto.FootballTeam;
import com.danut.springgraphql.footballstatistics.dto.NationalTeamInput;
import com.danut.springgraphql.footballstatistics.model.NationalTeam;

@org.mapstruct.Mapper
public interface Mapper {
    FootballTeam toTeam(NationalTeam nationalTeam);
    NationalTeam toNationalTeam(NationalTeamInput nationalTeamInput);
}
