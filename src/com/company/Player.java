package com.company;

import java.util.List;

public class Player implements Observer{

    private String name;

    public Player(String name){
        this.name = name;
    }

    @Override
    public void update(List<String> update){
        System.out.println("Hello, "+this.name+"\n There are some changes in our new update. Come and rate them!\n" + update + "\n");
    }
}
