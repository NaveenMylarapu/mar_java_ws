package com.flipkart.learn.day10;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class PlayerService {
    private List<Player> list;

    public PlayerService() throws URISyntaxException, IOException {
        list = new ArrayList<>();
        // Load from csv => add player to the list
        List<String> rows = Files.readAllLines(Path.of(PlayerService.class
                .getResource("/players.csv").toURI()));
        for (int i = 1; i < rows.size(); i++) {
            String data = rows.get(i);
            Player player = getPlayer(data);
            list.add(player);
        }
        System.out.println("Total player count :" + list.size());
    }

    private Player getPlayer(String data) {
        String[] arr = data.split(",");
        Player player = new Player();
        UUID id = UUID.randomUUID();
        String name = arr[0];
        String role = arr[1];
        double amount = Double.parseDouble(arr[2]);
        String country = arr[3];
        String team = arr[4];
        player.setId(id);
        player.setAmount(amount);
        player.setCountry(country);
        player.setName(name);
        player.setRole(role);
        player.setTeam(team);
        return player;
    }

    public List<Player> getPlayerByTeam(String team) {
        List<Player> teamPlayer = new ArrayList<>();
        for (Player player : list) {
            if (player.getTeam().equals(team))
                teamPlayer.add(player);
        }
        return teamPlayer;
    }

    public double maxAmount() {
        double max = list.get(0).getAmount();
        for (int i = 1; i < list.size(); i++) {
            double amount = list.get(i).getAmount();
            if (max < amount)
                max = amount;
        }
        return max;
    }

    public List<Player> getMaxpaidPlayers() {
        List<Player> maxPaidPlayers = new ArrayList<>();
        for (Player player : list) {
            if (player.getAmount() == maxAmount())
                maxPaidPlayers.add(player);
        }
        return maxPaidPlayers;
    }

    int count = 0;

    public int playerCount(String name) {

        for (Player player : list) {
            if (player.getTeam().equals(name))
                count++;
        }
        return count;
    }
    public List<Player> getPlayerByCountry(String country){
        List<Player> getplayerscountry = new ArrayList<>();
        for(Player player:list)
        {
            if(player.getCountry().equals(country))
                getplayerscountry.add(player);
        }
        return getplayerscountry;
    }
}

