package com.example.rdc;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PlayerStats implements Serializable {

    private String name;
    private int hp;
    private int mp;
    private int attack;
    private int defense;
    private int speed;
    private List<String> items; //list of lower case strings
    private List<String> spells;

    PlayerStats(String name) {
        this.name = name;
        hp = 5;
        mp = 5;
        attack = 3;
        defense = 3;
        speed = 3;
        items = new ArrayList<>();
        spells = new ArrayList<>();
    }

    void addItem(String item) {
        items.add(item);
    }

    void addSpell(String spell) {
        spells.add(spell);
    }

    void removeItem(String item) {
        items.remove(item);
    }

    void removeSpell(String spell) {
        spells.remove(spell);
    }

    public String getName() {
        return name;
    }

    public List<String> getItems() {
        return items;
    }

    public List<String> getSpells() {
        return spells;
    }

    //TODO checks if HP is 0
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
