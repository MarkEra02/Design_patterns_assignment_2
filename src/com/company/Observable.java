package com.company;

public interface Observable {
    void registerPlayer(Observer player);
    void unregisterPlayer(Observer player);
    void notifyAllPlayer();
}
