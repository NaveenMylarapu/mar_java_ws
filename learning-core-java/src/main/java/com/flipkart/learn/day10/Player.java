package com.flipkart.learn.day10;
import java.util.UUID;
public class Player {
    private String name;
    private String role;
    private String country;
    private String team;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", country='" + country + '\'' +
                ", team='" + team + '\'' +
                ", amount=" + amount +
                ", id=" + id +
                '}';
    }

    private double amount;
    private UUID id;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getCountry() {
        return country;
    }

    public String getTeam() {
        return team;
    }

    public double getAmount() {
        return amount;
    }



}
