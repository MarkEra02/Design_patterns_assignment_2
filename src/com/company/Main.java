package com.company;

public class Main {

    public static void main(String[] args) {
        someGame Minecraft = new someGame();

        Minecraft.addUpdate("Adventure Update");
        Minecraft.addUpdate("Pretty Scary Update");

        Player somePlayer = new Player("Mark");


        Minecraft.registerPlayer(somePlayer);
        Minecraft.addUpdate("Redstone Update");
        Minecraft.removeUpdate("Adventure Update");


    }
}
