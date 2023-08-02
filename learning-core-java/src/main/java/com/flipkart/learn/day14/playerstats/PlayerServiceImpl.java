package com.flipkart.learn.day14.playerstats;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlayerServiceImpl implements PlayerService {
    private List<Player> players;

    public PlayerServiceImpl() {
        try {
            players = CsvReaderUtil.loadPlayers();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override
    public double maxAmount() {
        double max = players.get(0).getAmount();
        for (Player player : players) {
            if (max < player.getAmount())
                max += player.getAmount();
        }
        return max;
    }

    public List<Player> getPlayers(Predicate<Player> predicate) {
        List<Player> list = new ArrayList<>();
        for (Player p : players) {
            if (predicate.test(p)) {
                list.add(p);
            }
        }
        return list;
    }

    @Override
    public List<TeamStatsDto> getTeamAmountStats() {
// Get total Players for a paticular team
// Get total amount spent on paticular Team.
        List<TeamStatsDto> teamList = new ArrayList<>();
        List<Player> teamPlayer;
        List<String> teamNames = getTeamNames();
        for (String t : teamNames) {
            teamPlayer = getPlayers((Predicate<Player>) player -> player.getTeam().equals(t));
            double totalAmount = totalAmount(teamPlayer);
            TeamStatsDto obj = new TeamStatsDto();
            obj.setTeamName(t);
            obj.setTotalAmount(totalAmount);
        }
        return teamList;
    }

    @Override
    public List<RoleAmountDto> getTeamRoleStats(String teamName) {
        //1. Get player of given team
        //2. Get Roles
        //3. Get players of the given role
        //4. Find sum of amount create role amount dto add to list
        List<RoleAmountDto> teamRolestats = new ArrayList<>();
        List<Player> teamplayers;
        List<String> roles = getRoles();
        teamplayers = getPlayers((Predicate<Player>) player -> player.getTeam().equals(teamName));
        for (String r : roles) {
            List<Player> teamPlayersForRole =teamRolePlayer(teamplayers,r);
            double ttotalAmount = totalAmount(teamPlayersForRole);
            RoleAmountDto obj = new RoleAmountDto();
            obj.setRoleName(r);
            obj.setTotalAmount(ttotalAmount);
        }
        return teamRolestats;
    }

    @Override
    public List<Player> getTopPaidPlayers(int n) {
        List<Player> topPaidPlayers = new ArrayList<>();
        for(int i=0;i<=n;i++) {
            topPaidPlayers = getPlayers((Predicate<Player>) player -> player.getAmount() > 40000000);
        }
        return topPaidPlayers;
    }

    @Override
    public List<String> getTeamNames() {
        List<String> getTeamNames = new ArrayList<>();
        for (Player p : players) {
            String tName = p.getTeam();
            if (!getTeamNames.contains(tName)) {
                getTeamNames.add(tName);
            }
        }
        return getTeamNames;
    }

    private double totalAmount(List<Player> list) {
        double tamount = 0;
        for (Player p : list) {
            tamount += p.getAmount();
        }
        return tamount;
    }

    public List<String> getRoles() {
        List<String> roles = new ArrayList<>();
        for (Player p : players) {
            String role = p.getRole();
            if (!roles.contains(role)) {
                roles.add(role);
            }
        }
        return roles;
    }

    public List<Player> teamRolePlayer(List<Player> list, String role) {
        List<Player> teamRolePlayer = new ArrayList<>();
        for (Player p : list) {
            p.getRole().equals(role);
            teamRolePlayer.add(p);
        }
        return teamRolePlayer;
    }
}