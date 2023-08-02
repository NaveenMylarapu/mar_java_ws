package com.flipkart.learn.day10;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public class Manager {
    public static void main(String[] args) throws URISyntaxException, IOException {
        PlayerService playerService = new PlayerService();
        List<Player> rcbPlayers = playerService.getPlayerByTeam("CSK");
        List<Player> rcbPlayers2 = playerService.getPlayerByTeam("RCB");
        List<Player> rcbPlayers3 = playerService.getPlayerByTeam("KKR");
        System.out.println(rcbPlayers3.toString());
        System.out.println(rcbPlayers.size());
        System.out.println(rcbPlayers2.size());
        System.out.println(rcbPlayers3.size());
        System.out.println("*".repeat(100));
        System.out.println("The max Amount is :"+playerService.maxAmount());
        System.out.println("The Max Paid Players List is :"+playerService.getMaxpaidPlayers());
        System.out.println("*".repeat(100));
        System.out.println("The total KKR players count is "+playerService.playerCount("KKR"));
        System.out.println(playerService.getPlayerByCountry("India"));




    }
}
