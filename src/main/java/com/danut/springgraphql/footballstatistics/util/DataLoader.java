package com.danut.springgraphql.footballstatistics.util;

import com.danut.springgraphql.footballstatistics.model.Club;
import com.danut.springgraphql.footballstatistics.model.Coach;
import com.danut.springgraphql.footballstatistics.model.NationalTeam;
import com.danut.springgraphql.footballstatistics.model.Player;
import com.danut.springgraphql.footballstatistics.repository.NationalTeamRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class DataLoader {

    public static final String ITALY = "Italy";
    public static final String ENGLAND = "England";
    private final NationalTeamRepository repository;

    public DataLoader(NationalTeamRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void buildData() {
        List<NationalTeam> nationalTeams = new ArrayList<>();
        nationalTeams.add(buildRomaniaTeam());
        nationalTeams.add(buildItalyTeam());
        nationalTeams.add(buildEnglandTeam());
        nationalTeams.forEach(repository::save);
    }

    private NationalTeam buildRomaniaTeam() {
        Player romaniaCaptain = buildPlayer("Vlad", "Chiriches", LocalDate.of(2011,8,10),"CENTRE-BACK",63, 0, 31, 1.84, "Sassuolo", ITALY);
        Player ianisHagi = buildPlayer("Ianis", "Hagi",  LocalDate.of(2018,11,17),"RIGHT-WINGER",18, 1, 22, 1.82, "Rangers", "Scotland");

        return NationalTeam.builder()
                .id("ROM")
                .name("Romania")
                .fifaRanking(43)
                .averageAge(27.4)
                .captain(romaniaCaptain)
                .coach(buildCoach("Mirel", "Radoi", 40, "Romanian"))
                .players(List.of(romaniaCaptain, ianisHagi))
                .build();
    }

    private NationalTeam buildItalyTeam() {
        Player italyCaptain = buildPlayer("Giorgio", "Chiellini",LocalDate.of(2004,11,17),"CENTRE-BACK", 112, 8, 36, 1.87, "Juventus", ITALY);
        Player leonardoBonucci = buildPlayer("Leonardo", "Bonucci",LocalDate.of(2010,3,3),"CENTRE-BACK", 109, 8, 34, 1.90, "Juventus", ITALY);

        return NationalTeam.builder()
                .id("ITA")
                .name(ITALY)
                .fifaRanking(7)
                .averageAge(28.7)
                .captain(italyCaptain)
                .coach(buildCoach("Roberto", "Mancini", 56, "Italian"))
                .players(List.of(italyCaptain, leonardoBonucci))
                .build();
    }

    private NationalTeam buildEnglandTeam() {
        Player englandCaptain = buildPlayer("Harry", "Kane", LocalDate.of(2015,3,27),"CENTRE-FORWARD",61, 38, 27, 1.88, "Tottenham", ENGLAND);
        Player raheemSterling = buildPlayer("Raheem", "Sterling", LocalDate.of(2012,11,14),"LEFT-WINGER",68, 17, 26, 1.70, "Manchester City", ENGLAND);

        return NationalTeam.builder()
                .id("ENG")
                .name(ENGLAND)
                .fifaRanking(4)
                .averageAge(26.7)
                .captain(englandCaptain)
                .coach(buildCoach("Gareth", "Southgate", 50, "English"))
                .players(List.of(englandCaptain, raheemSterling))
                .build();
    }

    private Coach buildCoach(String firstName, String lastName, int age, String nationality) {
        return Coach.builder()
                .firstName(firstName)
                .lastName(lastName)
                .nationality(nationality)
                .age(age)
                .build();
    }

    private Player buildPlayer(String firstName, String lastName, LocalDate debut, String position, int caps, int goals, int age, double height, String clubName, String clubCountry) {
        return Player.builder()
                .id(UUID.randomUUID().toString())
                .firstName(firstName)
                .lastName(lastName)
                .caps(caps)
                .goals(goals)
                .dob("11/14/1989")
                .age(age)
                .height(height)
                .club(buildClub(clubName, clubCountry))
                .debut(debut)
                .position(position)
                .build();
    }

    private Club buildClub(String clubName, String country) {
        return Club.builder()
                .name(clubName)
                .country(country)
                .build();
    }
}
