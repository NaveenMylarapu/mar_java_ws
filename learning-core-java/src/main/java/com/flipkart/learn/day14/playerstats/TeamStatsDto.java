package com.flipkart.learn.day14.playerstats;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class TeamStatsDto {
    private String teamName;
    private double totalAmount;

    public String getTeamName() {
        return teamName;
    }

}