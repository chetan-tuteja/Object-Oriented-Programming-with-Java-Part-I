/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chetan Tuteja
 */
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> list = new ArrayList<Player>();
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.maxSize = 16;

    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player addP) {
        if (size() < maxSize) {
            this.list.add(addP);
        } else {
            return;
        }

    }

    public void printPlayers() {
        for (Player i : this.list) {
            System.out.println(i.getName() + ", goals " + i.goals());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.list.size();
    }

    public int goals() {
        int total = 0;
        for (Player i : this.list) {
            total = total + i.goals();
        }
        return total;
    }
}
