package com.company;

import java.util.ArrayList;
import java.util.List;

public class someGame implements Observable{

    private List<String> newUpdate = new ArrayList<>();
    private List<Observer> player = new ArrayList<>();

    public void addUpdate(String update) {
        this.newUpdate.add(update);
        notifyAllPlayer();
    }

    public void removeUpdate(String update) {
        this.newUpdate.remove(update);
        notifyAllPlayer();
    }

    @Override
    public void registerPlayer(Observer player){
        this.player.add(player);
    }

    @Override
    public void unregisterPlayer(Observer player){
        this.player.remove(player);
    }

    @Override
    public void notifyAllPlayer() {
        for (Observer player: player) {
            player.update(this.newUpdate);
        }
    }

}
